package com.company;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Nashe", 10, 789456123, 1563660361, "Calderon de la barca 2991");
        Persona p2 = new Persona("Ashe", 30, 789456121, 1563660361, "Calderon de la barca 2992");
        Persona p3 = new Persona("Mashe", 20, 789456122, 1563660331, "Calderon de la barca 2993");
        p1.setEdad(p1.getEdad()*2);
        p2.setTelefono(1563660362);
        System.out.println(p3.getNombre() + " " + p3.getEdad() + " " + p3.getDireccion() + " " + p3.getTelefono() + " " + p3.getDNI());
    }
}
