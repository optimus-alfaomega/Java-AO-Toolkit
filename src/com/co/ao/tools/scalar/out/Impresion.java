package com.co.ao.tools.scalar.out;

public class Impresion {

    private Impresion() {
    }

    public static Impresion porPantalla() {
        return new Impresion();
    }

    public void impresion(Integer value) {
        System.out.print(value);
    }

    public void impresion(Double value) {
        System.out.print(value);
    }

    public void impresion(Float value) {
        System.out.print(value);
    }

    public void impresion(String value) {
        System.out.print(value);
    }

    public void impresion(char value) {
        System.out.print(value);
    }

    public void de(Integer value) {
        System.out.print(value);
    }

    public void de(Double value) {
        System.out.print(value);
    }

    public void de(Float value) {
        System.out.print(value);
    }

    public void de(String value) {
        System.out.print(value);
    }

    public void de(char value) {
        System.out.print(value);
    }

    public void finLinea() {
        System.out.println("");

    }

}
