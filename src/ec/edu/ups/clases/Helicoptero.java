/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author LENOVO
 */
public abstract class Helicoptero extends MedioTransporteAereo {
 private int númeroDeHelices;
 private int codigoPatinAterrizaje;
 private int codigoAletaDesviación;
 private String marcaRotorAntipar;

public Helicoptero(){
    
}

    public Helicoptero(int númeroDeHelices, int codigoPatinAterrizaje, int codigoAletaDesviación, String marcaRotorAntipar, String costoDeVuelo, String alturaDeVuelo) {
        super(costoDeVuelo, alturaDeVuelo);
        this.númeroDeHelices = númeroDeHelices;
        this.codigoPatinAterrizaje = codigoPatinAterrizaje;
        this.codigoAletaDesviación = codigoAletaDesviación;
        this.marcaRotorAntipar = marcaRotorAntipar;
    }


    public void setNúmeroDeHelices(int númeroDeHelices) {
        this.númeroDeHelices = númeroDeHelices;
    }

    public void setCodigoPatinAterrizaje(int codigoPatinAterrizaje) {
        this.codigoPatinAterrizaje = codigoPatinAterrizaje;
    }

    public void setCodigoAletaDesviación(int codigoAletaDesviación) {
        this.codigoAletaDesviación = codigoAletaDesviación;
    }

    public void setMarcaRotorAntipar(String marcaRotorAntipar) {
        this.marcaRotorAntipar = marcaRotorAntipar;
    }

    public int getNúmeroDeHelices() {
        return númeroDeHelices;
    }

    public int getCodigoPatinAterrizaje() {
        return codigoPatinAterrizaje;
    }

    public int getCodigoAletaDesviación() {
        return codigoAletaDesviación;
    }

    public String getMarcaRotorAntipar() {
        return marcaRotorAntipar;
    
}

    @Override
    public String toString() {
        return super.toString()+ "Helicoptero{" + "n\u00fameroDeHelices=" + númeroDeHelices + ", codigoPatinAterrizaje=" + codigoPatinAterrizaje + ", codigoAletaDesviaci\u00f3n=" + codigoAletaDesviación + ", marcaRotorAntipar=" + marcaRotorAntipar + '}';
    }
    
}