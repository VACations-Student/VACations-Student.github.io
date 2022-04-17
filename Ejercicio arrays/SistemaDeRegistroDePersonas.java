package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {
    private Persona p1;
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Persona> personas = new ArrayList<>();
    public SistemaDeRegistroDePersonas(){
        p1 = new Persona();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void InsertarPersonas()
    {
        System.out.println("Escriba su nombre: ");
        String Nombre = scan.next();
        System.out.println("Escriba su direccion: ");
        String Direccion = scan.next();
        System.out.println("Escriba su telefono: ");
        int Telefono = scan.nextInt();
        System.out.println("Escriba su DNI: ");
        int DNI = scan.nextInt();
        System.out.println("Escriba su Edad: ");
        int Edad = scan.nextInt();
        p1 = new Persona(Nombre, Edad, DNI, Telefono, Direccion);
        personas.add(p1);
    }
    public void Eliminar_persona(){
        for(int i=0; i<personas.size(); i++) {
            System.out.println("Ingrese el dni de la persona a eliminar: ");
            int Dni = scan.nextInt();
            if(Dni == personas.get(i).getDNI()) {
                personas.remove(i);
            }
            else{
                System.out.println("No se ecnontro la persona a eliminar");
            }
        }
    }
    public void Modificar_persona(){
        int Guardavovichdei = 0;
        int modificacionIn = 0;
        String modificacionSt = "lol";
        System.out.println("Ingrese el DNI de la persona a modificar: ");
        int Dni = scan.nextInt();
        System.out.println("Ingrese el dato a cambiar: ");
        int DatoACambiar = scan.nextInt();
        System.out.println("Ingrese la modificacion que quiere realizar: ");
        if(DatoACambiar == 1 || DatoACambiar == 2) {
            modificacionSt = scan.next();
        }
        else if(DatoACambiar == 3 || DatoACambiar == 4 || DatoACambiar == 5) {
            modificacionIn = scan.nextInt();
        }
        for(int i=0; i<personas.size(); i++) {
            if(Dni == personas.get(i).getDNI()) {
                Guardavovichdei = i;
                if(DatoACambiar == 1) {
                    personas.get(i).setDireccion(modificacionSt);
                }
                else if(DatoACambiar == 2) {
                    personas.get(i).setNombre(modificacionSt);
                }
                else if(DatoACambiar == 3) {
                    personas.get(i).setEdad(modificacionIn);
                }
                else if(DatoACambiar == 4) {
                    personas.get(i).setTelefono(modificacionIn);
                }
                else if(DatoACambiar == 5) {
                    personas.get(i).setDNI(modificacionIn);
                }
            }
            else{
                System.out.println("No se encontro a la persona en cuestion");
            }
        }
        System.out.println("Estos son los datos de la perosna: ");
        System.out.println(personas.get(Guardavovichdei).getDNI() + " " + personas.get(Guardavovichdei).getTelefono() + " " + personas.get(Guardavovichdei).getNombre()+ " " + personas.get(Guardavovichdei).getDireccion() + " " + personas.get(Guardavovichdei).getEdad());
    }
    public void Ver_Personas(){
        System.out.println("Estas son las perosnas registradas: ");
        for(int i = 0; i<personas.size(); i++){
            System.out.println("DNI: " + personas.get(i).getDNI() + " " + "Telefono: " + personas.get(i).getTelefono() + " " + "Nombre: " + personas.get(i).getNombre()+ " " + "Direccion: " + personas.get(i).getDireccion() + " " + "Edad: " + personas.get(i).getEdad());
        }
    }
    public void Ver_Personas_Mayores(){
        System.out.println("Estas son las perosnas mayores registradas: ");
        for(int i = 0; i<personas.size(); i++){
            if(personas.get(i).getEdad()>=18) {
                System.out.println("Nombre: " + personas.get(i).getNombre());
            }
            else{
                //sadge
            }
        }
    }
}

