package com.company;

public class Persona {
    private int edad;
    private String nombre;
    private int DNI;
    private int telefono;
    private String Direccion;

    public Persona(){
    }

    public Persona(String nombre, int edad, int DNI, int telefono, String Direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.telefono = telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean esMayorDeEdad(){
        return this.edad > 18;
    }

    public boolean sonLaMismaPersona(Persona p){
        return this.DNI == p.getDNI();
    }

    public static void main(String[] args) {
        Persona persona_prueba = new Persona("Marcos", 17, 78, 1563660361, "Cogland");
        Persona persona_prueba2 = new Persona("Nicolas", 16, 69, 1557440880, "Calderon_de_la_Barca");
        persona_prueba.sonLaMismaPersona(persona_prueba2);
    }
}
