/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.AvionDeCarga;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author LENOVO
 */
public class ControladorAvionDeCarga {
     private SortedSet <AvionDeCarga> lista;
    private int codigo;
    
    
    public void ControladorAvionDeCarga(){
        lista=new TreeSet<>();
        codigo =0;        
    }
    public void create(AvionDeCarga objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    public AvionDeCarga read(int codigo){
        for(AvionDeCarga avionDeCarga : lista){
            if(avionDeCarga.getCodigo() == (codigo)){
                return avionDeCarga;
            }
        }
        return null;
    }
     public void update(AvionDeCarga objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
      public void delete(int codigo){
        for(AvionDeCarga objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
    }
       public void imprimir(){
        for (AvionDeCarga avionDeCarga : lista) {
            System.out.println(avionDeCarga.getAlturaDeVuelo());
        }
    }
    
}


