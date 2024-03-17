package com.fouadev.exercice1;

public class Main {
    public static void main(String[] args) throws NombreNegatifException {
        try {

            EntierNaturel entierNaturel = new EntierNaturel(3);
            System.out.println(entierNaturel.getVal());
            entierNaturel.setVal(-1);

        }catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
        }

        try {
            EntierNaturel entierNaturel = new EntierNaturel(3);
            System.out.println(entierNaturel.getVal());
            entierNaturel.setVal(0);
            entierNaturel.decrementer();
        } catch (NombreNegatifException e) {
            System.out.println("Error: "+e.getMessage());
        }

    }
}