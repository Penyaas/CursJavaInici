package com.jetbrains;
import java.util.*;
public class Condicionals {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();
    /*    if (edad >= 18){
            System.out.println("Ets major d'edad!");
        } else {
            System.out.println("Ets menor d'edad!");
        }*/
        if (edad <= 18){
            System.out.println("Etapa pajera o niñato");
        }
        else if (edad<40){
            System.out.println("Joven con responsabilidades");
        }
        else if (edad < 65){
            System.out.println("Madurit@");
        }
        else {
            System.out.println("Te quedan 2 telediarios");
        }
    }
}
