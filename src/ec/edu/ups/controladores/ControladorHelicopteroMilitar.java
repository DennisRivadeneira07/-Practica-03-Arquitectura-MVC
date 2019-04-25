/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.clases.HelicopteroMilitar;
import java.util.ArrayList;
import java.util.List;

public class ControladorHelicopteroMilitar {
    private List<HelicopteroMilitar> lista;
    private int codigo;

    public ControladorHelicopteroMilitar() {
        lista = new ArrayList<>();
        codigo = 1;
    }
    public void create(HelicopteroMilitar objeto) {
        objeto.setCodigo(codigo);
        codigo++;
        lista.add(objeto);
    }
    public HelicopteroMilitar read(int codigo) {
        for (HelicopteroMilitar helicopteroMilitar : lista) {
            if (helicopteroMilitar.getCodigo() == codigo) {
                return helicopteroMilitar;
            }
        }
        return null;
    }
    public void update(HelicopteroMilitar objeto) {
        for (int i = 0; i < lista.size(); i++) {
            HelicopteroMilitar elemento = lista.get(i);
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.set(i, objeto);
                break;
            }
        }
    }
    public void delete(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            HelicopteroMilitar elemento = lista.get(i);
            if (elemento.getCodigo() == codigo) {
                lista.remove(i);
                break;
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getAlturaDeVuelo());
        }
    }
}
