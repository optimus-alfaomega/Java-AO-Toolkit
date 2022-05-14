package com.co.ao.tools.math.scalar;

public class Print {

    private Print() {
    }

    public static Print byScreen() {
        return new Print();
    }

    public void of(Integer value) {
        System.out.print(value);

    }

    public void of(Double value) {
        System.out.print(value);
    }

    public void of(Float value) {
        System.out.print(value);
    }

    public void of(String value) {
        System.out.print(value);
    }

    public void of(char value) {
        System.out.print(value);
    }

    public void endl() {
        System.out.println("");

    }

}
