/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorAvionDeCarga;
import ec.edu.ups.controladores.ControladorAvionMilitar;
import ec.edu.ups.controladores.ControladorHelicopteroGrua;
import ec.edu.ups.controladores.ControladorHelicopteroMilitar;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Principal {
    public static void main(String args[]) throws ParseException{

        Scanner escaner = new Scanner(System.in);
        boolean repetir = true;
        
        ControladorAvionDeCarga controladorAvionDeCarga=new ControladorAvionDeCarga();
        ControladorAvionMilitar controladorAvionMilitar=new ControladorAvionMilitar();
        ControladorHelicopteroGrua controladorHelicopteroGrua=new ControladorHelicopteroGrua();
        ControladorHelicopteroMilitar controladorHelicopteroMilitar=new ControladorHelicopteroMilitar();
    
     do {
            System.out.println("Elija una opción:\n1) CRUD Profesional\n2) CRUD NoProfesional\n3) CRUD Lactante\n"
                    + "4) CRUD AvionDeCarga\n5) SALIR");
            int opc = escaner.nextInt();

            switch (opc) {
    }
     case 1:
                    boolean repetirHelicopteroMilitar = true;
                    do {
                    System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Listar\n6) Regresar");
                        int opcionHelicopteroMilitar = escaner.nextInt();
                        switch (opcionHelicopteroMilitar) {
                        case 1:
                       System.out.println("Ingrse número de armas equipadas");
                       int NumeroDeArmasEquipadas=escaner.nextInt();
                       System.out.println("Ingrese cual es el tipo de ");
     }
     }
     }
     