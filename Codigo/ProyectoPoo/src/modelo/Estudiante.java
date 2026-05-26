/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author USER_ASUS
 */
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cedula;
    private String nombreCompleto;
    private String nivelAcademico;
    private double promedioAcademico;
    private String nombreDelRepresentante;

    private ArrayList<Beca> historialBecas;
    private ArrayList<Pension> registroPensiones;

    public Estudiante(String cedula, String nombreCompleto, String nivelAcademico, double promedioAcademico, String nombreDelRepresentante, ArrayList<Beca> historialBecas, ArrayList<Pension> registroPensiones) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.nivelAcademico = nivelAcademico;
        this.promedioAcademico = promedioAcademico;
        this.nombreDelRepresentante = nombreDelRepresentante;
        this.historialBecas = historialBecas;
        this.registroPensiones = registroPensiones;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(double promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }

    public String getNombreDelRepresentante() {
        return nombreDelRepresentante;
    }

    public void setNombreDelRepresentante(String nombreDelRepresentante) {
        this.nombreDelRepresentante = nombreDelRepresentante;
    }

    public ArrayList<Beca> getHistorialBecas() {
        return historialBecas;
    }

    public void setHistorialBecas(ArrayList<Beca> historialBecas) {
        this.historialBecas = historialBecas;
    }

    public ArrayList<Pension> getRegistroPensiones() {
        return registroPensiones;
    }

    public void setRegistroPensiones(ArrayList<Pension> registroPensiones) {
        this.registroPensiones = registroPensiones;
    }

    public void agregarPension(Pension nuevaPension) {
        this.registroPensiones.add(nuevaPension);
    }

    public void agregarBeca(Beca nuevaBeca) {
        this.historialBecas.add(nuevaBeca);
    }

}
