package com.jetbrains;

public class Metodes {
    public static void main(String[] args) {
        //Metode Math sqrt
        double raiz= Math.sqrt(9);
        System.out.println(raiz);


         //Metode Math round
        double num1=5.85;
        int resultat=(int) Math.round(num1);
        System.out.println(resultat);



         //Metode Math Pow
        double base=5;
        double exponente=3;
        int resultado= (int) Math.pow(base,exponente);
        System.out.println("El resultat " +base+ " elevat a " +exponente+ " es " +resultado);

    }
}
