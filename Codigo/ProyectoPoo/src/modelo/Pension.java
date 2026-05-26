/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author USER_ASUS
 */
public class Pension implements Serializable {

    private static final long serialVersionUID = 2L;

    private String idFactura;
    private String mes;
    private double montonBase;
    private double descuentoAplicado;
    private double montoFinal;
    private String estadoPago;

   
    public Pension(String idFactura, String mes, double montonBase, double descuentoAplicado, String estadoPago) {
        this.idFactura = idFactura;
        this.mes = mes;
        this.montonBase = montonBase;
        this.descuentoAplicado = descuentoAplicado;
        this.montoFinal = montonBase - descuentoAplicado;
        this.estadoPago = estadoPago;

    }

    public void aplicarDescuento(double porcentaje) {
        this.descuentoAplicado = montonBase * (porcentaje / 100.0);
        this.montoFinal = montonBase - descuentoAplicado;
    }

    public void marcarComoPagada() {
        this.estadoPago = "PAGADA";
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getMontonBase() {
        return montonBase;
    }

    public void setMontonBase(double montonBase) {
        this.montonBase = montonBase;
    }

    public double getDescuentoAplicado() {
        return descuentoAplicado;
    }

    public void setDescuentoAplicado(double d) {
        this.descuentoAplicado = d;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    @Override
    public String toString() {
        return String.format(
                "Factura: %-6s | Mes: %-10s | Base: $%6.2f | Desc: $%5.2f | Total: $%6.2f | %s",
                idFactura, mes, montonBase, descuentoAplicado, montoFinal, estadoPago);
    }
}
