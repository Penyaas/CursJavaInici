package com.jetbrains;

public class Clase_String {
    public static void main(String[] args) {
        String nombre = "Margalida";
        System.out.println("El meu nom es " +nombre);
        System.out.println("El meu nom te " + nombre.length() + " lletres");
        System.out.println("La primera lletra del meu nom es " +nombre.charAt(0));
        int ultima_letra;
        ultima_letra = nombre.length();
        System.out.println("La darrera lletra del meu nom es " +nombre.charAt(ultima_letra-1));
    }
}
