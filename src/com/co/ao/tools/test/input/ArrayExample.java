package com.co.ao.tools.test.input;

import java.util.Random;

public class ArrayExample {

    public int[] getIntegerExampleArray(final int size) {
        int[] array = new int[size];
        Random rand = new Random();

        for (int index = 0; index < size; index++) {
            array[index] = rand.nextInt(100);
        }

        return array;
    }

    public float[] getFloatExampleArray(final int size) {
        float[] array = new float[size];
        Random rand = new Random();

        for (int index = 0; index < size; index++) {
            array[index] = rand.nextFloat(100);
        }

        return array;
    }

    public double[] getDoubleExampleArray(final int size) {
        double[] array = new double[size];
        Random rand = new Random();

        for (int index = 0; index < size; index++) {
            array[index] = rand.nextDouble(100);
        }

        return array;
    }

    public char[] getCharExampleArray(final int size) {
        char[] array = new char[size];
        Random rand = new Random();
        int radix = 10;

        for (int index = 0; index < size; index++) {
            array[index] = Character.forDigit(rand.nextInt(100), radix);
        }

        return array;
    }

    public String[] getCharacterExampleArray() {
        String[] array = new String[26];

        array[0] = "A";
        array[1] = "B";
        array[2] = "C";
        array[3] = "D";
        array[4] = "E";
        array[5] = "F";
        array[6] = "G";
        array[7] = "H";
        array[8] = "I";
        array[9] = "J";
        array[10] = "K";
        array[11] = "L";
        array[12] = "M";
        array[13] = "N";
        array[14] = "O";
        array[15] = "P";
        array[16] = "Q";
        array[17] = "R";
        array[18] = "S";
        array[19] = "T";
        array[20] = "U";
        array[21] = "V";
        array[22] = "W";
        array[23] = "X";
        array[24] = "Y";
        array[25] = "Z";

        return array;
    }

    public String[] getWomenNamesExampleArray() {
        String[] array = new String[5];

        array[0] = "Maria";
        array[1] = "Marcela";
        array[2] = "Carolina";
        array[3] = "Patricia";
        array[4] = "Mariana";

        return array;
    }

    public String[] getMenNamesExampleArray() {
        String[] array = new String[5];

        array[0] = "Alex";
        array[1] = "Marcelo";
        array[2] = "Jaime";
        array[3] = "Omar";
        array[4] = "Alejandro";

        return array;
    }

    public String[] getSecondNamesExampleArray() {
        String[] array = new String[5];

        array[0] = "Lopez";
        array[1] = "Prieto";
        array[2] = "Ortiz";
        array[3] = "Viña";
        array[4] = "Guzman";

        return array;
    }

    public Integer[] getIdentificationExampleArray() {
        Integer[] array = new Integer[100];
        Random rand = new Random();

        for (int index = 0; index < 100; index++) {
            array[index] = rand.nextInt(999999999);
        }

        return array;
    }

}
