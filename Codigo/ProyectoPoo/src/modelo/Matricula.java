/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;


public class Matricula implements Serializable {

    private static final long serialVersionUID = 4L;

    private int idAlumno;
    private int año;
    private double costoBase;
    private double totalDescuento;
    private double totalPagado;

    public Matricula(int idAlumno, int año, double costoBase) {
        this.idAlumno = idAlumno;
        this.año = año;
        this.costoBase = costoBase;
        this.totalDescuento = 0;
        this.totalPagado = costoBase;
    }

    public void aplicarDescuento(double porcentaje) {
        double descuentoNuevo = costoBase * (porcentaje / 100.0);

        if (totalDescuento + descuentoNuevo > costoBase) {
            descuentoNuevo = costoBase - totalDescuento;
            System.out.println("  [Aviso] Descuento ajustado para no exceder el 100%.");
        }

        totalDescuento += descuentoNuevo;
        totalPagado = costoBase - totalDescuento;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public int getAño() {
        return año;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public double getTotalDescuento() {
        return totalDescuento;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    @Override
    public String toString() {
        return String.format(
                "Matrícula %d | Costo base: $%.2f | Descuento: $%.2f | Total a pagar: $%.2f",
                año, costoBase, totalDescuento, totalPagado);
    }

}
