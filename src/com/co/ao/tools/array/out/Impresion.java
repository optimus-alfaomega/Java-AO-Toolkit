package com.co.ao.tools.array.out;

public class Impresion {

    private Impresion() {
    }

    public static Impresion porPantalla() {
        return new Impresion();
    }

    public void impresion(Integer Matrix[]) {
        System.out.print("{");

        for (Integer value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void impresion(Double Matrix[]) {
        System.out.print("{");

        for (Double value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void impresion(Float Matrix[]) {
        System.out.print("{");

        for (Float value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void impresion(char Matrix[]) {
        System.out.print("{");

        for (char value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void impresion(String Matrix[]) {
        System.out.print("{");

        for (String value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void de(Integer Matrix[]) {
        System.out.print("{");

        for (Integer value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void de(Double Matrix[]) {
        System.out.print("{");

        for (Double value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void de(Float Matrix[]) {
        System.out.print("{");

        for (Float value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void de(char Matrix[]) {
        System.out.print("{");

        for (char value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void de(String Matrix[]) {
        System.out.print("{");

        for (String value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

}
