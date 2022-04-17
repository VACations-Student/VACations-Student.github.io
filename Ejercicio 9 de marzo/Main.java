package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Producto p1 = new Producto("lol",15f);
        int respuesta = 1;
        Float precio_total=0f;
        while(respuesta==1) {
            System.out.println("Pone el nombre");
            p1.setNombre(scan.next());
            System.out.println("Pone el precio");
            p1.setPrecio(scan.nextFloat());
            precio_total += p1.getPrecio();
            System.out.println("Importe actual: " + precio_total);
            System.out.println("Quiere ingresar un nuevo producto? 1/0");
            respuesta = scan.nextInt();
        }
        System.out.println("Importe total: " + precio_total);
    }
}
