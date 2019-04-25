/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.HelicopteroGrua;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author LENOVO
 */
public class ControladorHelicopteroGrua {
    private Map<Integer, HelicopteroGrua> lista;
    private int codigo;
    
    
      public ControladorHelicopteroGrua() {
        lista = new TreeMap<>();
        codigo = 0;
    }
       public void create(HelicopteroGrua objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
    }
       public HelicopteroGrua read(int codigo){
        if(lista.get(codigo) != null){
            return lista.get(codigo);
        }
        return null;
    }
       public void update(HelicopteroGrua objeto){
        lista.put(objeto.getCodigo(), objeto);
    }
    public void delete(int codigo){
        lista.remove(codigo);
    }
    public void imprimir(){
        
        for(Map.Entry<Integer, HelicopteroGrua> elemento : lista.entrySet()){
            int key = elemento.getKey();
            String alturaHelicopteroGrua = elemento.getValue().getAlturaDeVuelo();
            System.out.println("Key : " + key + " Preadolescente : " + alturaHelicopteroGrua);
        }
    }
}
