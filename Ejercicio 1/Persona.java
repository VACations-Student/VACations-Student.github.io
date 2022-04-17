package com.company;

public class Persona {
    private int edad;
    private String nombre;
    private int DNI;
    private int telefono;
    private String Direccion;

    public Persona(){
    }
    public Persona(String palabra){
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

    public boolean sonLaMismaPersona(int DNI){
        return this.DNI == DNI;
    }


}
