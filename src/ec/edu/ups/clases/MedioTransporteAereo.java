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
public class MedioTransporteAereo implements Comparable<MedioTransporteAereo> {

    private int codigo;
    private int numroPasajeros;
    private String costoDeVuelo;
    private int numeroTripulantes;
    private String alturaDeVuelo;
    
  

    public MedioTransporteAereo(String costoDeVuelo, String alturaDeVuelo) {
        this.alturaDeVuelo = alturaDeVuelo;
        this.costoDeVuelo = costoDeVuelo;
    }

    public MedioTransporteAereo() {

    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNumroPasajeros(int numroPasajeros) {
        this.numroPasajeros = numroPasajeros;
    }

    public void setCostoDeVuelo(String costoDeVuelo) {
        this.costoDeVuelo = costoDeVuelo;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public void setAlturaDeVuelo(String alturaDeVuelo) {
        this.alturaDeVuelo = alturaDeVuelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNumroPasajeros() {
        return numroPasajeros;
    }

    public String getCostoDeVuelo() {
        return costoDeVuelo;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public String getAlturaDeVuelo() {
        return alturaDeVuelo;
    }

    @Override
    public String toString() {
        return "MedioTransporteAereo{" + "codigo=" + codigo + ", numroPasajeros=" + numroPasajeros + ", costoDeVuelo=" + costoDeVuelo + ", numeroTripulantes=" + numeroTripulantes + ", alturaDeVuelo=" + alturaDeVuelo + '}';
    }
    @Override
    public int hashCode() {
        int hash = 9;
        hash = 60 * hash + this.codigo;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MedioTransporteAereo other = (MedioTransporteAereo) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(MedioTransporteAereo o) {

        return alturaDeVuelo.compareTo(costoDeVuelo);
    }

}
