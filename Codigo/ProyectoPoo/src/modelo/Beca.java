/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author USER_ASUS
 */
public class Beca implements Serializable {

    private static final long serialVersionUID = 3L;

    private String idBeca;
    private String nombreBeca;
    private double porcentajeDescuento;
    private String periodoAcademico;

    public Beca(String idBeca, String nombreBeca, double porcentajeDescuento, String periodoAcademico) {
        this.idBeca = idBeca;
        this.nombreBeca = nombreBeca;
        this.porcentajeDescuento = porcentajeDescuento;
        this.periodoAcademico = periodoAcademico;
    }

    public String getIdBeca() {
        return idBeca;
    }

    public void setIdBeca(String idBeca) {
        this.idBeca = idBeca;
    }

    public String getNombreBeca() {
        return nombreBeca;
    }

    public void setNombreBeca(String nombreBeca) {
        this.nombreBeca = nombreBeca;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

}
