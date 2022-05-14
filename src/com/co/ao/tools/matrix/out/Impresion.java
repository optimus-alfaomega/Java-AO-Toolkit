package com.co.ao.tools.matrix.out;

public class Impresion {

    private Impresion() {
    }

    public static Impresion porPantalla() {
        return new Impresion();
    }

    public void de(Integer Matrix[][]) {

        System.out.print("[");
        for (int indexX = 0; indexX < Matrix.length; indexX++) {
            System.out.print("{");

            for (int indexY = 0; indexY < Matrix[0].length; indexY++) {
                System.out.print(Matrix[indexX][indexY]);
                if (indexY < Matrix[0].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");

        }

        System.out.println("]");

    }

    public void de(float Matrix[][]) {

        System.out.print("[");
        for (int indexX = 0; indexX < Matrix.length; indexX++) {
            System.out.print("{");

            for (int indexY = 0; indexY < Matrix[0].length; indexY++) {
                System.out.print(Matrix[indexX][indexY]);
                if (indexY < Matrix[0].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");

        }

        System.out.println("]");

    }

    public void de(double Matrix[][]) {

        System.out.print("[");
        for (int indexX = 0; indexX < Matrix.length; indexX++) {
            System.out.print("{");

            for (int indexY = 0; indexY < Matrix[0].length; indexY++) {
                System.out.print(Matrix[indexX][indexY]);
                if (indexY < Matrix[0].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");

        }

        System.out.println("]");

    }

    public void de(char Matrix[][]) {

        System.out.print("[");
        for (int indexX = 0; indexX < Matrix.length; indexX++) {
            System.out.print("{");

            for (int indexY = 0; indexY < Matrix[0].length; indexY++) {
                System.out.print(Matrix[indexX][indexY]);
                if (indexY < Matrix[0].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");

        }

        System.out.println("]");

    }

    public void de(String Matrix[][]) {

        System.out.print("[");
        for (int indexX = 0; indexX < Matrix.length; indexX++) {
            System.out.print("{");

            for (int indexY = 0; indexY < Matrix[0].length; indexY++) {
                System.out.print(Matrix[indexX][indexY]);
                if (indexY < Matrix[0].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");

        }

        System.out.println("]");

    }

}
