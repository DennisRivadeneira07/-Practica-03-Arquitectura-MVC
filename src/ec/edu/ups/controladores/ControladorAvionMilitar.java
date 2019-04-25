/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.AvionMilitar;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class ControladorAvionMilitar {
       private Set<AvionMilitar> lista;
       private int codigo;
       
       
       public ControladorAvionMilitar() {
        lista = new HashSet<>();
        codigo = 0;
    }
       public void create(AvionMilitar objeto){
            codigo++;
        objeto.setCodigo(this.codigo);
        lista.add(objeto);
    }

        public AvionMilitar read(int codigo){
        for(AvionMilitar avionMilitar : lista){
            if(codigo == avionMilitar.getCodigo()){
                return avionMilitar;
            }
        }
        return null;
    }
        public void update(AvionMilitar objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }

        public void delete(int codigo){
        
        for(AvionMilitar objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
        
    }
         public void imprimir(){
        for (AvionMilitar avionMilitar : lista) {
            System.out.println(avionMilitar.getAlturaDeVuelo());
        }
    }
    
        
       
       }

