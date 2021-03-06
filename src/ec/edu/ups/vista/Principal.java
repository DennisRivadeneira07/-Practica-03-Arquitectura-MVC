/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.AvionDeCarga;
import ec.edu.ups.clases.AvionMilitar;
import ec.edu.ups.clases.HelicopteroGrua;
import ec.edu.ups.clases.HelicopteroMilitar;
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

    public static void main(String args[]) throws ParseException {

        Scanner escaner = new Scanner(System.in);
        boolean repetir = true;

        ControladorAvionDeCarga controladorAvionDeCarga = new ControladorAvionDeCarga();
        ControladorAvionMilitar controladorAvionMilitar = new ControladorAvionMilitar();
        ControladorHelicopteroGrua controladorHelicopteroGrua = new ControladorHelicopteroGrua();
        ControladorHelicopteroMilitar controladorHelicopteroMilitar = new ControladorHelicopteroMilitar();

        do {
            System.out.println("Elija una opción:\n1) CRUD HelicopteroMilitar\n2) CRUD HelicopteroGrua\n3) CRUD AvionMilitar\n"
                    + "4) CRUD AvionDeCarga\n5) SALIR");
            int opc = escaner.nextInt();

            switch (opc) {

                case 1:
                    boolean repetirHelicopteroMilitar = true;
                    do {
                        System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Listar\n6) Regresar");
                        int opcionHelicopteroMilitar = escaner.nextInt();
                        switch (opcionHelicopteroMilitar) {
                            case 1:
                                System.out.println("Ingrse número de armas equipadas");
                                int NumeroDeArmasEquipadas = escaner.nextInt();
                                System.out.println("Ingrese cual es el tipo de Helicoptero Militar");
                                String tipoDeHelicopteroMilitar = escaner.next();
                                System.out.println("Nombre Del Francotirador del Helicoptero");
                                String nombreFrancotirador = escaner.next();
                                System.out.println("Cantidad de militares transportados");
                                int cantiMilitares = escaner.nextInt();
                                System.out.println("Número de Helices");
                                int numHeli = escaner.nextInt();
                                System.out.println("Codigo del patin de Aterrizaje");
                                int codPatin = escaner.nextInt();
                                System.out.println("Codigo Aleta de Desviación");
                                int codAl = escaner.nextInt();
                                System.out.println("Ingrese marca de Rotor Antipar");
                                String rotAnt = escaner.next();
                                System.out.println("Ingrese costo de vuelo");
                                String costVuel = escaner.next();
                                System.out.println("Ingrese Altura de vuelo");
                                String altVuel = escaner.next();
                                HelicopteroMilitar objeto = new HelicopteroMilitar(NumeroDeArmasEquipadas, tipoDeHelicopteroMilitar, nombreFrancotirador, cantiMilitares, numHeli, codPatin, codAl, rotAnt, costVuel, altVuel);
                                controladorHelicopteroMilitar.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del HelicopteroMilitar");
                                int codigo2 = escaner.nextInt();
                                System.out.println(controladorHelicopteroMilitar.read(codigo2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del profesional");
                                codigo2 = escaner.nextInt();
                                if (controladorHelicopteroMilitar.read(codigo2) != null) {
                                    System.out.println("Ingrse número de armas equipadas");
                                    NumeroDeArmasEquipadas = escaner.nextInt();
                                    System.out.println("Ingrese cual es el tipo de Helicoptero Militar");
                                    tipoDeHelicopteroMilitar = escaner.next();
                                    System.out.println("Nombre Del Francotirador del Helicoptero");
                                    nombreFrancotirador = escaner.next();
                                    System.out.println("Cantidad de militares transportados");
                                    cantiMilitares = escaner.nextInt();
                                    System.out.println("Número de Helices");
                                    numHeli = escaner.nextInt();
                                    System.out.println("Codigo del patin de Aterrizaje");
                                    codPatin = escaner.nextInt();
                                    System.out.println("Codigo Aleta de Desviación");
                                    codAl = escaner.nextInt();
                                    System.out.println("Ingrese marca de Rotor Antipar");
                                    rotAnt = escaner.next();
                                    System.out.println("Ingrese costo de vuelo");
                                    costVuel = escaner.next();
                                    System.out.println("Ingrese Altura de vuelo");
                                    altVuel = escaner.next();
                                    objeto = new HelicopteroMilitar(NumeroDeArmasEquipadas, tipoDeHelicopteroMilitar, nombreFrancotirador, cantiMilitares, numHeli, codPatin, codAl, rotAnt, costVuel, altVuel);
                                    controladorHelicopteroMilitar.update(objeto);
                                    objeto.setCodigo(codigo2);

                                } else {
                                    System.out.println("Helicoptero militar no existe ");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del Helicoptero Militar que va a eliminar");
                                codigo2 = escaner.nextInt();
                                controladorHelicopteroMilitar.delete(codigo2);
                                break;
                            case 5:
                                controladorHelicopteroMilitar.imprimir();
                                break;
                            case 6:
                                repetirHelicopteroMilitar = false;
                                break;
                        }
                    } while (repetirHelicopteroMilitar);
                    break;
                case 2:
                    boolean repetirHelicopteroGrua = true;
                    do {
                        System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Listar\n6) Regresar");
                        int opciHelicopteroGrua = escaner.nextInt();
                        switch (opciHelicopteroGrua) {
                            case 1:
                                System.out.println("Ingrese el Largo del clable de la grua");
                                String largoCable = escaner.next();
                                System.out.println("Ingrese la capacidad de la grua");
                                String capGrua = escaner.next();
                                System.out.println("Ingrese el número de gruas que contiene el helicoptero");
                                int numGrua = escaner.nextInt();
                                System.out.println("Ingrese el tamaño del gancho de la grua");
                                String tamGncho = escaner.next();
                                System.out.println("Ingrese el número de helices que contiene el helicoptero");
                                int numHeli = escaner.nextInt();
                                System.out.println("Codigo del patin de Aterrizaje");
                                int codPatin = escaner.nextInt();
                                System.out.println("Codigo Aleta de Desviación");
                                int codAl = escaner.nextInt();
                                System.out.println("Ingrese marca de Rotor Antipar");
                                String rotAnt = escaner.next();
                                System.out.println("Ingrese costo de vuelo");
                                String costVuel = escaner.next();
                                System.out.println("Ingrese Altura de vuelo");
                                String altVuel = escaner.next();
                                HelicopteroGrua objeto = new HelicopteroGrua(largoCable, capGrua, numGrua, tamGncho, numHeli, codPatin, codAl, rotAnt, altVuel, costVuel);
                                controladorHelicopteroGrua.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del Helicoptero Grua");
                                int codigo2 = escaner.nextInt();
                                System.out.println(controladorHelicopteroGrua.read(codigo2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del Helicoptero Grua");
                                codigo2 = escaner.nextInt();
                                if (controladorHelicopteroGrua.read(codigo2) != null) {
                                    System.out.println("Ingrese el Largo del clable de la grua");
                                    largoCable = escaner.next();
                                    System.out.println("Ingrese la capacidad de la grua");
                                    capGrua = escaner.next();
                                    System.out.println("Ingrese el número de gruas que contiene el helicoptero");
                                    numGrua = escaner.nextInt();
                                    System.out.println("Ingrese el tamaño del gancho de la grua");
                                    tamGncho = escaner.next();
                                    System.out.println("Ingrese el número de helices que contiene el helicoptero");
                                    numHeli = escaner.nextInt();
                                    System.out.println("Codigo del patin de Aterrizaje");
                                    codPatin = escaner.nextInt();
                                    System.out.println("Codigo Aleta de Desviación");
                                    codAl = escaner.nextInt();
                                    System.out.println("Ingrese marca de Rotor Antipar");
                                    rotAnt = escaner.next();
                                    System.out.println("Ingrese costo de vuelo");
                                    costVuel = escaner.next();
                                    System.out.println("Ingrese Altura de vuelo");
                                    altVuel = escaner.next();
                                    objeto = new HelicopteroGrua(largoCable, capGrua, numGrua, tamGncho, numHeli, codPatin, codAl, rotAnt, costVuel, altVuel);
                                    controladorHelicopteroGrua.update(objeto);
                                    objeto.setCodigo(codigo2);

                                } else {
                                    System.out.println("El Helicoptero Grua no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del Helicoptero Grua que va a eliminar");
                                codigo2 = escaner.nextInt();
                                controladorHelicopteroGrua.delete(codigo2);
                                break;
                            case 5:
                                controladorHelicopteroGrua.imprimir();
                                break;
                            case 6:
                                repetirHelicopteroGrua = false;
                                break;
                        }
                    } while (repetir);

                    break;
                case 3:
                    boolean repetirAvionMilitar = true;
                    do {
                        System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Listar\n6) Regresar");
                        int opcionAvionMilitar = escaner.nextInt();
                        switch (opcionAvionMilitar) {
                            case 1:
                                System.out.println("Ingrese peso en armas ");
                                String pesoArm = escaner.next();
                                System.out.println("Ingrese numero de armas en  unidades ");
                                int numArm = escaner.nextInt();
                                System.out.println("Ingrese cual es el tipo de armas");
                                String tipArm = escaner.next();
                                System.out.println("Ingrese nombre del Francotirador del Avión");
                                String nomFranc = escaner.next();
                                System.out.println("Ingrese número de alas");
                                int numAlas = escaner.nextInt();
                                System.out.println("Ingrese número de azafatas");
                                int numAz = escaner.nextInt();
                                System.out.println("Ingrese numero de Horas De Servicio De Comida");
                                String horaSer = escaner.next();
                                System.out.println("Ingrese en que clase desea viajar");
                                String clase = escaner.next();
                                System.out.println("Ingrese el costo de Vuelo");
                                String costo = escaner.next();
                                System.out.println("Ingrese Altura de Vuelo");
                                String altura = escaner.next();
                                AvionMilitar objeto = new AvionMilitar(pesoArm, numArm, tipArm, nomFranc, numAlas, numAz, horaSer, clase, costo, altura);
                                controladorAvionMilitar.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del   Avion Militar");
                                int codigo2 = escaner.nextInt();
                                System.out.println(controladorAvionMilitar.read(codigo2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del Avion Militar");
                                codigo2 = escaner.nextInt();
                                if (controladorAvionMilitar.read(codigo2) != null) {
                                    System.out.println("Ingrese peso en armas ");
                                    pesoArm = escaner.next();
                                    System.out.println("Ingrese numero de armas en  unidades ");
                                    numArm = escaner.nextInt();
                                    System.out.println("Ingrese cual es el tipo de armas");
                                    tipArm = escaner.next();
                                    System.out.println("Ingrese nombre del Francotirador del Avión");
                                    nomFranc = escaner.next();
                                    System.out.println("Ingrese número de alas");
                                    numAlas = escaner.nextInt();
                                    System.out.println("Ingrese número de azafatas");
                                    numAz = escaner.nextInt();
                                    System.out.println("Ingrese numero de Horas De Servicio De Comida");
                                    horaSer = escaner.next();
                                    System.out.println("Ingrese en que clase desea viajar");
                                    clase = escaner.next();
                                    System.out.println("Ingrese el costo de Vuelo");
                                    costo = escaner.next();
                                    System.out.println("Ingrese Altura de Vuelo");
                                    altura = escaner.next();
                                    objeto = new AvionMilitar(pesoArm, numArm, tipArm, nomFranc, numAlas, numAz, horaSer, clase, costo, altura);
                                    objeto.setCodigo(codigo2);
                                    controladorAvionMilitar.update(objeto);

                                } else {
                                    System.out.println("El Avion Militar no existe ");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del Avion Militar que va a eliminar");
                                codigo2 = escaner.nextInt();
                                controladorAvionMilitar.delete(codigo2);
                                break;
                            case 5:
                                controladorAvionMilitar.imprimir();
                                break;
                            case 6:
                                repetirAvionMilitar = false;
                                break;
                        }
                    } while (repetirAvionMilitar);

                    break;
                case 4:
                    boolean repetirAvionDeCarga = true;
                    do {
                        System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Listar\n6) Regresar");
                        int opcionAvionDeCarga = escaner.nextInt();
                        switch (opcionAvionDeCarga) {
                            case 1:
                                System.out.println("Ingrese peso de la carga ");
                                String pesoCarga = escaner.next();
                                System.out.println("Ingrese cantidad de carga en unidades");
                                int carga = escaner.nextInt();
                                System.out.println("Ingrese tipo de carga");
                                String tipCarg = escaner.next();
                                System.out.println("Ingrese codigo de carga");
                                int codCar = escaner.nextInt();
                                System.out.println("Ingrese número de alas");
                                int numAl = escaner.nextInt();
                                System.out.println("Número de azafatas ");
                                int numAza = escaner.nextInt();
                                System.out.println("Ingrese las horas de servio de comida");
                                String numHoras = escaner.next();
                                System.out.println("Ingrese la categoria en la que desea viajar");
                                String cat = escaner.next();
                                System.out.println("Ingrese costo de vuelo");
                                String cost = escaner.next();
                                System.out.println("Ingrese altura de vuelo");
                                String altu = escaner.next();
                                AvionDeCarga objeto = new AvionDeCarga(pesoCarga, carga, tipCarg, codCar, numAl, numAza, numHoras, cat, cost, altu);
                                controladorAvionDeCarga.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del Avion de Carga");
                                int codigo2 = escaner.nextInt();
                                System.out.println(controladorAvionDeCarga.read(codigo2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo de Avion de Carga");
                                codigo2 = escaner.nextInt();
                                if (controladorAvionDeCarga.read(codigo2) != null) {
                                    System.out.println("Ingrese peso de la carga ");
                                    pesoCarga = escaner.next();
                                    System.out.println("Ingrese cantidad de carga en unidades");
                                    carga = escaner.nextInt();
                                    System.out.println("Ingrese tipo de carga");
                                    tipCarg = escaner.next();
                                    System.out.println("Ingrese codigo de carga");
                                    codCar = escaner.nextInt();
                                    System.out.println("Ingrese número de alas");
                                    numAl = escaner.nextInt();
                                    System.out.println("Número de azafatas ");
                                    numAza = escaner.nextInt();
                                    System.out.println("Ingrese las horas de servio de comida");
                                    numHoras = escaner.next();
                                    System.out.println("Ingrese la categoria en la que desea viajar");
                                    cat = escaner.next();
                                    System.out.println("Ingrese costo de vuelo");
                                    cost = escaner.next();
                                    System.out.println("Ingrese altura de vuelo");
                                    altu = escaner.next();
                                    objeto = new AvionDeCarga(pesoCarga, carga, tipCarg, codCar, numAl, numAza, numHoras, cat, cost, altu);
                                    objeto.setCodigo(codigo2);
                                    controladorAvionDeCarga.update(objeto);
                                } else {
                                    System.out.println("El Avion  de Carga no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del Avion de Carga que va a eliminar");
                                codigo2 = escaner.nextInt();
                                controladorAvionDeCarga.delete(codigo2);
                                break;
                            case 5:
                                controladorAvionDeCarga.imprimir();
                                break;
                            case 6:
                                repetirAvionDeCarga = false;
                                break;
                        }
                    } while (repetirAvionDeCarga);

                    break;
                case 5:
                    repetir = false;

            }

        } while (repetir);
    }

}
