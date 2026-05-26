/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import modelo.Beca;
import modelo.Estudiante;
import modelo.Pension;

public class SistemaEscolar {

    private ArrayList<Estudiante> listaEstudiantes;
    private controlador.ArchivoLectura lector;
    private controlador.ArchivoEscritura escritor;
    private final double COSTO_PENSION_BASE = 120.0;

    // 2. CAMBIO AQUÍ: El constructor ahora se llama igual que la clase (SistemaEscolar)
    public SistemaEscolar() {
        this.lector = new controlador.ArchivoLectura();
        this.escritor = new controlador.ArchivoEscritura();

        this.listaEstudiantes = lector.cargarTodo();

        if (this.listaEstudiantes == null) {
            this.listaEstudiantes = new ArrayList<>();
        }
    }

    public Estudiante buscarEstudiante(String cedula) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante e = listaEstudiantes.get(i);
            if (e.getCedula().equals(cedula)) {
                return e;
            }
        }
        return null;
    }

    public void registrarEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
        escritor.guardarTodo(listaEstudiantes);
    }

    public void facturarMes(String mes, String cedula, boolean tieneHermanos) {
        Estudiante est = buscarEstudiante(cedula);
        if (est == null) {
            return;
        }

        double descuento = 0.0;

        if (est.getPromedioAcademico() >= 9.0) {
            descuento = descuento + 25.0;
        }

        if (tieneHermanos == true) {
            descuento = descuento + 15.0;
        }

        String idFac = "FAC-" + mes + "-" + cedula;

        Pension nuevaPension = new Pension(idFac, mes, COSTO_PENSION_BASE, descuento, "Pendiente");
        est.agregarPension(nuevaPension);//Aqui el estudiante ya tiene una pension registrada
        escritor.guardarTodo(listaEstudiantes);
    }

    public boolean asignarBecaMatricula(String cedula, Beca nuevaBeca) {
        Estudiante est = buscarEstudiante(cedula);
        if (est == null) {
            return false;
        }

        double porcentajeAcumulado = 0.0;

        for (int i = 0; i < est.getHistorialBecas().size(); i++) { //tamaño 3
            Beca b = est.getHistorialBecas().get(i);
  
            if (b.getPeriodoAcademico().equals(nuevaBeca.getPeriodoAcademico())) {
                porcentajeAcumulado = porcentajeAcumulado + b.getPorcentajeDescuento();
            }
        }

        if (porcentajeAcumulado + nuevaBeca.getPorcentajeDescuento() > 100.0) {
            return false;
        }

        est.agregarBeca(nuevaBeca);
        escritor.guardarTodo(listaEstudiantes);
        return true;
    }

    public String obtenerHistorialBecasDetallado(String cedula) {
        Estudiante est = buscarEstudiante(cedula);
        if (est == null) {
            return "Estudiante no encontrado en el sistema.";
        }

        String texto = "HISTORIAL DE BECAS DEL ALUMNO: " + est.getNombreCompleto() + "\n";
        texto = texto + "--------------------------------------------------\n";

        if (est.getHistorialBecas().isEmpty() == true) {
            texto = texto + "El alumno no registra ninguna beca asignada actualmente.";
            return texto;
        }

        for (int i = 0; i < est.getHistorialBecas().size(); i++) {
            Beca b = est.getHistorialBecas().get(i);

            texto = texto + "- Periodo Lectivo: " + b.getPeriodoAcademico() + "\n";
            texto = texto + "  Tipo de Beca: " + b.getNombreBeca() + "\n";
            texto = texto + "  Descuento: " + b.getPorcentajeDescuento() + "%\n";
            texto = texto + "--------------------------------------------------\n";
        }

        return texto;
    }

    public String generarReporteMorosidad() {
        String textoReporte = "REPORTE DE CARTERA VENCIDA (ALERTAS DE DEUDA)\n";
        textoReporte = textoReporte + "==================================================\n";

        boolean encontramosMorosos = false;

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante est = listaEstudiantes.get(i);

            int contadorPensionesPendientes = 0;

            for (int j = 0; j < est.getRegistroPensiones().size(); j++) {
                Pension pen = est.getRegistroPensiones().get(j);

                if (pen.getEstadoPago().equals("Pendiente")) {
                    contadorPensionesPendientes = contadorPensionesPendientes + 1;
                }
            }

            if (contadorPensionesPendientes > 2) {
                encontramosMorosos = true;
                textoReporte = textoReporte + "REPRESENTANTE RESPONSABLE: " + est.getNombreDelRepresentante() + "\n";
                textoReporte = textoReporte + "   Alumno: " + est.getNombreCompleto() + " (Cédula: " + est.getCedula() + ")\n";
                textoReporte = textoReporte + "   Meses en Mora: " + contadorPensionesPendientes + " pensiones pendientes.\n";
                textoReporte = textoReporte + "--------------------------------------------------\n";
            }
        }

        if (encontramosMorosos == false) {
            return "No se registran representantes con más de 2 meses de retraso.";
        }

        return textoReporte;
    }
}
