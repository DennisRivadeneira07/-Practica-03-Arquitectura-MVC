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
public abstract class Avion extends MedioTransporteAereo {

    private int numeroDeAlas;
    private int numeroDeAzafatas;
    private String horasServicioDeCommida;
    private String categoriaSocial;

    public Avion() {

    }

    public Avion(int numeroDeAlas, int numeroDeAzafatas, String horasServicioDeCommida, String categoriaSocial) {
        this.numeroDeAlas = numeroDeAlas;
        this.numeroDeAzafatas = numeroDeAzafatas;
        this.horasServicioDeCommida = horasServicioDeCommida;
        this.categoriaSocial = categoriaSocial;
    }
    
    

    public Avion(int numeroDeAlas, int numeroDeAzafatas, String horasServicioDeCommida, String categoriaSocial, String costoDeVuelo, String alturaDeVuelo) {
        super(costoDeVuelo, alturaDeVuelo);
        this.numeroDeAlas = numeroDeAlas;
        this.numeroDeAzafatas = numeroDeAzafatas;
        this.horasServicioDeCommida = horasServicioDeCommida;
        this.categoriaSocial = categoriaSocial;
    }

    public void setNumeroDeAlas(int numeroDeAlas) {
        this.numeroDeAlas = numeroDeAlas;
    }

    public void setNumeroDeAzafatas(int numeroDeAzafatas) {
        this.numeroDeAzafatas = numeroDeAzafatas;
    }

    public void setHorasServicioDeCommida(String horasServicioDeCommida) {
        this.horasServicioDeCommida = horasServicioDeCommida;
    }

    public void setCategoriaSocial(String categoriaSocial) {
        this.categoriaSocial = categoriaSocial;
    }

    public int getNumeroDeAlas() {
        return numeroDeAlas;
    }

    public int getNumeroDeAzafatas() {
        return numeroDeAzafatas;
    }

    public String getHorasServicioDeCommida() {
        return horasServicioDeCommida;
    }

    public String getCategoriaSocial() {
        return categoriaSocial;
    }

    @Override
    public String toString() {
        return super.toString() +"Avion{" + "numeroDeAlas=" + numeroDeAlas + ", numeroDeAzafatas=" + numeroDeAzafatas + ", horasServicioDeCommida=" + horasServicioDeCommida + ", categoriaSocial=" + categoriaSocial + '}';
    }

}
