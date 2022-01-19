package com.jetbrains;
import javax.swing.*;
public class Entrada_ejemplo2 {
    public static void main(String[] args) {
        String Nom_usuari = JOptionPane.showInputDialog("Introdueix el teu nom: ");
        String edad_usuari = JOptionPane.showInputDialog("Introdueix la teva edad: ");
        int edad = Integer.parseInt(edad_usuari);
        edad++;
        System.out.println("Hola " + Nom_usuari + ", El novembre de l'any que ve tendras  " + edad + " anys.");
    }
}
