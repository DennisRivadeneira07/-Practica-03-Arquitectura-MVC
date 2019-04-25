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
public final class HelicopteroGrua extends Helicoptero implements Acciones {
   private String LargoCableGrua;
   private String capacidadGrua;
   private int numeroGruas;
   private String tamañoGanchoGrua;
   
   public HelicopteroGrua(){
       
   }

    public HelicopteroGrua(String LargoCableGrua, String capacidadGrua, int numeroGruas, String tamañoGanchoGrua, int númeroDeHelices, int codigoPatinAterrizaje, int codigoAletaDesviación, String marcaRotorAntipar, String costoDeVuelo, String alturaDeVuelo) {
        super(númeroDeHelices, codigoPatinAterrizaje, codigoAletaDesviación, marcaRotorAntipar, costoDeVuelo, alturaDeVuelo);
        this.LargoCableGrua = LargoCableGrua;
        this.capacidadGrua = capacidadGrua;
        this.numeroGruas = numeroGruas;
        this.tamañoGanchoGrua = tamañoGanchoGrua;
    }

    public void setLargoCableGrua(String LargoCableGrua) {
        this.LargoCableGrua = LargoCableGrua;
    }

    public void setCapacidadGrua(String capacidadGrua) {
        this.capacidadGrua = capacidadGrua;
    }

    public void setNumeroGruas(int numeroGruas) {
        this.numeroGruas = numeroGruas;
    }

    public void setTamañoGanchoGrua(String tamañoGanchoGrua) {
        this.tamañoGanchoGrua = tamañoGanchoGrua;
    }

    public String getLargoCableGrua() {
        return LargoCableGrua;
    }

    public String getCapacidadGrua() {
        return capacidadGrua;
    }

    public int getNumeroGruas() {
        return numeroGruas;
    }

    public String getTamañoGanchoGrua() {
        return tamañoGanchoGrua;
    }

    @Override
    public String toString() {
        return "HelicopteroGrua{" + "LargoCableGrua=" + LargoCableGrua + ", capacidadGrua=" + capacidadGrua + ", numeroGruas=" + numeroGruas + ", tama\u00f1oGanchoGrua=" + tamañoGanchoGrua + '}';
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
