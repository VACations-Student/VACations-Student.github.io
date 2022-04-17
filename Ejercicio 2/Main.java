package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Persona p1 = new Persona("Nashe", 10, 789456123, 1563660361, "Calderon de la barca 2991");
        Persona p2 = new Persona("Ashe", 30, 789456121, 1563660361, "Calderon de la barca 2992");
        Persona p3 = new Persona();
        System.out.println("¿Cual es tu nombre?");
        p3.setNombre(myObj.nextLine());
        System.out.println("¿Cual es tu Direccion?");
        p3.setDireccion(myObj.nextLine());
        System.out.println("¿Cual es tu edad?");
        p3.setEdad(myObj.nextInt());
        System.out.println("¿Cual es tu DNI?");
        p3.setDNI(myObj.nextInt());
        System.out.println("¿Cual es tu telefono?");
        p3.setTelefono(myObj.nextInt());
        System.out.println(p3.getEdad() + " " + p3.getDNI() + " " + p3.getTelefono() + " " + p3.getDireccion() + " " + p3.getNombre());
        System.out.println("¿Quiere cambiar alguno de sus datos? 1/0");
        int Decision = myObj.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        if(Decision==1) {
            System.out.println("¿Qué dato quiere cambiar? E/I/T/D/N");
            char Dato_A_Cambiar = myObj.next().charAt(0);
            if (Dato_A_Cambiar == 'E' || Dato_A_Cambiar == 'e') {
                System.out.println("¿Cual es tu edad?");
                p3.setEdad(scanner2.nextInt());
            } else if (Dato_A_Cambiar == 'I' || Dato_A_Cambiar == 'i') {
                System.out.println("¿Cual es tu DNI?");
                p3.setDNI(scanner2.nextInt());
            } else if (Dato_A_Cambiar == 'T' || Dato_A_Cambiar == 't') {
                System.out.println("¿Cual es tu telefono?");
                p3.setTelefono(scanner2.nextInt());
            } else if (Dato_A_Cambiar == 'D' || Dato_A_Cambiar == 'd') {
                System.out.println("¿Cual es tu Direccion?");
                p3.setDireccion(scanner2.next());
            } else if (Dato_A_Cambiar == 'N' || Dato_A_Cambiar == 'n') {
                System.out.println("¿Cual es tu nombre?");
                p3.setNombre(scanner2.next());
            }
            System.out.println(p3.getEdad() + " " + p3.getDNI() + " " + p3.getTelefono() + " " + p3.getDireccion() + " " + p3.getNombre());
        }
        }
}
