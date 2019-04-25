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
public final class HelicopteroMilitar extends Helicoptero implements Acciones  {
     private int numeroArmasEquipadasUnidades;
    private String tipoHelicopteroMilitar;
    private String nombreFrancoTirador;
    private int cantidadDeMilitaresTransportados;

    public HelicopteroMilitar() {
    }

    public HelicopteroMilitar(int numeroArmasEquipadasUnidades, String tipoHelicopteroMilitar, String nombreFrancoTirador, int cantidadDeMilitaresTransportados, int númeroDeHelices, int codigoPatinAterrizaje, int codigoAletaDesviación, String marcaRotorAntipar, String costoDeVuelo, String alturaDeVuelo) {
        super(númeroDeHelices, codigoPatinAterrizaje, codigoAletaDesviación, marcaRotorAntipar, costoDeVuelo, alturaDeVuelo);
        this.numeroArmasEquipadasUnidades = numeroArmasEquipadasUnidades;
        this.tipoHelicopteroMilitar = tipoHelicopteroMilitar;
        this.nombreFrancoTirador = nombreFrancoTirador;
        this.cantidadDeMilitaresTransportados = cantidadDeMilitaresTransportados;
    }

    public void setNumeroArmasEquipadasUnidades(int numeroArmasEquipadasUnidades) {
        this.numeroArmasEquipadasUnidades = numeroArmasEquipadasUnidades;
    }

    public void setTipoHelicopteroMilitar(String tipoHelicopteroMilitar) {
        this.tipoHelicopteroMilitar = tipoHelicopteroMilitar;
    }

    public void setNombreFrancoTirador(String nombreFrancoTirador) {
        this.nombreFrancoTirador = nombreFrancoTirador;
    }

    public void setCantidadDeMilitaresTransportados(int cantidadDeMilitaresTransportados) {
        this.cantidadDeMilitaresTransportados = cantidadDeMilitaresTransportados;
    }

    public int getNumeroArmasEquipadasUnidades() {
        return numeroArmasEquipadasUnidades;
    }

    public String getTipoHelicopteroMilitar() {
        return tipoHelicopteroMilitar;
    }

    public String getNombreFrancoTirador() {
        return nombreFrancoTirador;
    }

    public int getCantidadDeMilitaresTransportados() {
        return cantidadDeMilitaresTransportados;
    }

    @Override
    public String toString() {
        return super.toString() +"HelicopteroMilitar{" + "numeroArmasEquipadasUnidades=" + numeroArmasEquipadasUnidades + ", tipoHelicopteroMilitar=" + tipoHelicopteroMilitar + ", nombreFrancoTirador=" + nombreFrancoTirador + ", cantidadDeMilitaresTransportados=" + cantidadDeMilitaresTransportados + '}';
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
