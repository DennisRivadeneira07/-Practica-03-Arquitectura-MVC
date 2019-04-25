/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

public final class AvionDeCarga extends Avion implements Acciones {
    private String pesoDeCarga;
    private int cantidadDeCargaUnidades;
    private String tipoDeCarga;
    private int codigoDeCarga;
    
    public AvionDeCarga(){        
    }
    
    public AvionDeCarga(String pesoDeCarga, int cantidadDeCargaUnidades, String tipoDeCarga, int codigoDeCarga) {
        this.pesoDeCarga = pesoDeCarga;
        this.cantidadDeCargaUnidades = cantidadDeCargaUnidades;
        this.tipoDeCarga = tipoDeCarga;
        this.codigoDeCarga = codigoDeCarga;
    }

    public AvionDeCarga(String pesoDeCarga, int cantidadDeCargaUnidades, String tipoDeCarga, int codigoDeCarga, int numeroDeAlas, int numeroDeAzafatas, String horasServicioDeCommida, String categoriaSocial, String costoDeVuelo, String alturaDeVuelo) {
        super(numeroDeAlas, numeroDeAzafatas, horasServicioDeCommida, categoriaSocial, costoDeVuelo, alturaDeVuelo);
        this.pesoDeCarga = pesoDeCarga;
        this.cantidadDeCargaUnidades = cantidadDeCargaUnidades;
        this.tipoDeCarga = tipoDeCarga;
        this.codigoDeCarga = codigoDeCarga;
    }
    
    
        public void setPesoDeCarga(String pesoDeCarga) {
        this.pesoDeCarga = pesoDeCarga;
    }

    public void setCantidadDeCargaUnidades(int cantidadDeCargaUnidades) {
        this.cantidadDeCargaUnidades = cantidadDeCargaUnidades;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        this.tipoDeCarga = tipoDeCarga;
    }

    public void setCodigoDeCarga(int codigoDeCarga) {
        this.codigoDeCarga = codigoDeCarga;
    }

    public String getPesoDeCarga() {
        return pesoDeCarga;
    }

    public int getCantidadDeCargaUnidades() {
        return cantidadDeCargaUnidades;
    }

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public int getCodigoDeCarga() {
        return codigoDeCarga;
    }
    

    @Override
    public String toString() {
        return super.toString() +"AvionDeCarga{" + "pesoDeCarga=" + pesoDeCarga + ", cantidadDeCargaUnidades=" + cantidadDeCargaUnidades + ", tipoDeCarga=" + tipoDeCarga + ", codigoDeCarga=" + codigoDeCarga + '}';
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