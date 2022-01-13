package com.jetbrains;

import java.util.Scanner;

public class Entrada_ejemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix el teu nom: ");
        String nom_usuari = entrada.nextLine();
        System.out.println("Introdueix la teva edad: ");
        int edad_usuari = entrada.nextInt();
        System.out.println("Hola " +nom_usuari+ " en el 2022 tendràs " +(edad_usuari+1)+ " anys");
    }
}
