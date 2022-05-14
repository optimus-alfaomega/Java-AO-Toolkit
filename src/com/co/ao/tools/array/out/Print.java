package com.co.ao.tools.array.out;

public class Print {

    public static Print byScreen() {
        return new Print();
    }

    public void of(Integer Matrix[]) {
        System.out.print("{");

        for (Integer value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void of(Double Matrix[]) {
        System.out.print("{");

        for (Double value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void of(Float Matrix[]) {
        System.out.print("{");

        for (Float value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void of(char Matrix[]) {
        System.out.print("{");

        for (char value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

    public void of(String Matrix[]) {
        System.out.print("{");

        for (String value : Matrix) {
            System.out.print(" " + value + " ");
        }
        System.out.println("}");

    }

}
