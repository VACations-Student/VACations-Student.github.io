package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SistemaDeRegistroDePersonas Registro = new SistemaDeRegistroDePersonas();
        int salir = 0;
        while (salir != 1) {
            System.out.println("¿Qué accion va a realizar?");
            System.out.println("1) Registrar una persona");
            System.out.println("2) Eliminar los datos de una persona");
            System.out.println("3) Modificar los datos de una persona");
            System.out.println("4) Ver perosnas");
            System.out.println("5) Ver perosnas mayores");
            int opcion = scan.nextInt();
            if (opcion == 1) {
                Registro.InsertarPersonas();
            }
            else if(opcion == 2) {
                Registro.Eliminar_persona();
            }
            else if(opcion == 3) {
                Registro.Modificar_persona();
            }
            else if(opcion == 4){
                Registro.Ver_Personas();
            }
            else if(opcion == 5){
                Registro.Ver_Personas_Mayores();
            }
            System.out.println("¿Quiere salir? 1/0");
            salir = scan.nextInt();
        }
        System.out.println("bye!");
    }
}