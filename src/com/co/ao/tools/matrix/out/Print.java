package com.co.ao.tools.matrix.out;

public class Print {

    private Print() {
    }

    public static Print byScreen() {
        return new Print();
    }

    public void of(Integer Matrix[][]) {

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

    public void of(float Matrix[][]) {

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

    public void of(double Matrix[][]) {

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

    public void of(char Matrix[][]) {

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

    public void of(String Matrix[][]) {

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
