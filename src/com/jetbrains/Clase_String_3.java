package com.jetbrains;

public class Clase_String_3 {
    public static void main(String[] args) {
        String alumno1,alumno2;
        alumno1 = "David";
        alumno2 = "David";
        System.out.println(alumno1.equals(alumno2));
        String alumno3,alumno4;
        alumno3 = "Toni";
        alumno4 = "tonI";
        System.out.println(alumno3.equalsIgnoreCase(alumno4));

    }
}
