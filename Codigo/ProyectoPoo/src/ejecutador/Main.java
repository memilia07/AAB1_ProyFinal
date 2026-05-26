/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutador;

import java.util.ArrayList;
import modelo.Beca;
import modelo.Estudiante;
import servicios.SistemaEscolar;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== INICIANDO SISTEMA ESCOLAR 2026 ===");

        SistemaEscolar sistema = new SistemaEscolar();

        ArrayList<Beca> becasVacias = new ArrayList<>();
        ArrayList<modelo.Pension> pensionesVacias = new ArrayList<>();

        System.out.println("\n[1] Registrando estudiantes en el sistema...");

        Estudiante alumno1 = new Estudiante(
                "1725489630",
                "Juan Perez",
                "Bachillerato",
                9.5,
                "Carlos Perez",
                becasVacias,
                pensionesVacias
        );
        sistema.registrarEstudiante(alumno1);
        System.out.println("-> Alumno 1 guardado: " + alumno1.getNombreCompleto());

        Estudiante alumno2 = new Estudiante(
                "1105478963",
                "Diego Piedra",
                "Bachillerato",
                8.0,
                "Ramiro Piedra",
                new ArrayList<>(),
                new ArrayList<>()
        );
        sistema.registrarEstudiante(alumno2);
        System.out.println("-> Alumno 2 guardado: " + alumno2.getNombreCompleto());

        Beca becaHermano = new Beca("B03", "Beca por Hermanos", 20.0, "2026");
        ArrayList<Beca> becasConHermano = new ArrayList<>();
        becasConHermano.add(becaHermano);

        Estudiante alumno3 = new Estudiante(
                "1109998881",
                "Luis Suarez",
                "Secundaria",
                8.5,
                "Enrique Suarez Senior",
                new ArrayList<>(),
                new ArrayList<>()
        );
        sistema.registrarEstudiante(alumno3);
        System.out.println("-> Alumno 3 guardado: " + alumno3.getNombreCompleto() + " (Hermano Mayor)");

        Estudiante alumno4 = new Estudiante(
                "1109998882",
                "Sofia Suarez",
                "Secundaria",
                8.2,
                "Enrique Suarez Senior",
                becasConHermano,
                new ArrayList<>()
        );
        sistema.registrarEstudiante(alumno4);
        System.out.println("-> Alumno 4 guardado: " + alumno4.getNombreCompleto() + " (Aplica Beca por Hermanos)");

        System.out.println("\n[2] Facturando pensiones mensuales...");

        // Factura de Juan
        sistema.facturarMes("Mayo", "1725489630", true);
        System.out.println("-> Pension de Mayo generada para Juan Perez.");

        // Facturas acumuladas de Mateo (Corrección del log en consola)
        sistema.facturarMes("Marzo", "1105478963", false);
        sistema.facturarMes("Abril", "1105478963", false);
        sistema.facturarMes("Mayo", "1105478963", false);
        System.out.println("-> Pensiones de Marzo, Abril y Mayo generadas para Mateo Piedra (Genera Morosidad).");

        // 📌 Facturamos el mes de Mayo a los hermanos para probar la rebaja
        sistema.facturarMes("Mayo", "1109998881", true);  // Luis paga normal
        sistema.facturarMes("Mayo", "1109998882", false); // María se genera con descuento y queda pendiente
        System.out.println("-> Pensiones de Mayo facturadas para los Hermanos Suarez.");

        System.out.println("\n[3] Procesando asignación de becas para Juan Perez...");

        Beca beca1 = new Beca("B01", "Beca Socioeconómica", 60.0, "2026");
        boolean exito1 = sistema.asignarBecaMatricula("1725489630", beca1);
        System.out.println("¿Se pudo asignar primera beca (60%)?: " + exito1);

        Beca beca2 = new Beca("B02", "Beca Deportiva", 50.0, "2026");
        boolean exito2 = sistema.asignarBecaMatricula("1725489630", beca2);
        System.out.println("¿Se pudo asignar segunda beca (50%)?: " + exito2 + " (Esperado: false por superar el 100%)");

        System.out.println("\n[4] Generando reportes del sistema...");

        System.out.println("\n--- HISTORIAL DE BECAS DETALLADO: " + alumno1.getNombreCompleto().toUpperCase() + " ---");
        String historial1 = sistema.obtenerHistorialBecasDetallado(alumno1.getCedula());
        System.out.println(historial1);

        System.out.println("--- HISTORIAL DE BECAS DETALLADO: " + alumno2.getNombreCompleto().toUpperCase() + " ---");
        String historial2 = sistema.obtenerHistorialBecasDetallado(alumno2.getCedula());
        System.out.println(historial2);

        System.out.println("--- HISTORIAL DE BECAS DETALLADO: " + alumno4.getNombreCompleto().toUpperCase() + " ---");
        String historial4 = sistema.obtenerHistorialBecasDetallado(alumno4.getCedula());
        System.out.println(historial4);

        System.out.println("\n--- REPORTE DE CARTERA VENCIDA GENERAL ---");
        String reporteMora = sistema.generarReporteMorosidad();
        System.out.println(reporteMora);

        System.out.println("\n=== PRUEBA FINALIZADA CON ÉXITO ===");
    }
}
