package com.jetbrains;
import java.util.*;
import javax.swing.*;

public class Condicionals2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tria una opció: \n1: Cuadrat \n2: Rectangle \n3: Triangle \n4: Cercle");
        int figura = entrada.nextInt();
        switch (figura){
            case 1:
                int costat = Integer.parseInt(JOptionPane.showInputDialog("Introdueix el costat: "));
                System.out.println("L'area del cuadrat es: " + Math.pow(costat,2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la base: "));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la altura: "));
                System.out.println("L'area del rectangle es: " +base*altura);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la base: "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la altura: "));
                System.out.println("L'area del triangle es: " +(base*altura)/2);
                break;
            case 4:
                int radi = Integer.parseInt(JOptionPane.showInputDialog("Introdueix el radi: "));
                System.out.print("L'area del cercle es ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radi,2)));
                break;
            default:
                System.out.println("L'opcio és incorrecte");

        }
    }
}
