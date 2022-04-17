package com.company;

public class Producto {
        private String nombre;
        private Float precio;
        public Producto(String nombre, Float precio) {
            this.nombre=nombre;
            this.precio=precio;
        }
        public Producto() {

        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public Float getPrecio() {
            return precio;
        }

        public void setPrecio(Float precio) {
            this.precio = precio;
        }
    }
