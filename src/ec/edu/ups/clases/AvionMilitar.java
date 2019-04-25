/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author LENOVO
 */
public final class AvionMilitar extends Avion implements Acciones {
     
    private String pesoArmas;
    private int nuemeroArmasEnUnidades;
    private String tipoDeArmas;
    private String nombreDeFrancoTirador;

    public AvionMilitar() {

    }

    public AvionMilitar(String pesoArmas, int nuemeroArmasEnUnidades, String tipoDeArmas, String nombreDeFrancoTirador, int numeroDeAlas, int numeroDeAzafatas, String horasServicioDeCommida, String categoriaSocial, String costoDeVuelo, String alturaDeVuelo) {
        super(numeroDeAlas, numeroDeAzafatas, horasServicioDeCommida, categoriaSocial, costoDeVuelo, alturaDeVuelo);
        this.pesoArmas = pesoArmas;
        this.nuemeroArmasEnUnidades = nuemeroArmasEnUnidades;
        this.tipoDeArmas = tipoDeArmas;
        this.nombreDeFrancoTirador = nombreDeFrancoTirador;
    }

    public void setPesoArmas(String pesoArmas) {
        this.pesoArmas = pesoArmas;
    }

    public void setNuemeroArmasEnUnidades(int nuemeroArmasEnUnidades) {
        this.nuemeroArmasEnUnidades = nuemeroArmasEnUnidades;
    }

    public void setTipoDeArmas(String tipoDeArmas) {
        this.tipoDeArmas = tipoDeArmas;
    }

    public void setNombreDeFrancoTirador(String nombreDeFrancoTirador) {
        this.nombreDeFrancoTirador = nombreDeFrancoTirador;
    }

    public String getPesoArmas() {
        return pesoArmas;
    }

    public int getNuemeroArmasEnUnidades() {
        return nuemeroArmasEnUnidades;
    }

    public String getTipoDeArmas() {
        return tipoDeArmas;
    }

    public String getNombreDeFrancoTirador() {
        return nombreDeFrancoTirador;
    }

    @Override
    public String toString() {
        return super.toString()+"AvionMilitar{" + "pesoArmas=" + pesoArmas + ", nuemeroArmasEnUnidades=" + nuemeroArmasEnUnidades + ", tipoDeArmas=" + tipoDeArmas + ", nombreDeFrancoTirador=" + nombreDeFrancoTirador + '}';
    }

    @Override
    public String despegar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String volar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
