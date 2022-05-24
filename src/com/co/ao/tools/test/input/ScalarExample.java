package com.co.ao.tools.test.input;

import java.util.Random;

public class ScalarExample {
    public Integer getRandomValue(final Integer maxValue) {
        Random rand = new Random();
        return rand.nextInt(maxValue);
    }

    public Double getRandomValue(final Double maxValue) {
        Random rand = new Random();
        return rand.nextDouble(maxValue);
    }

    public float getRandomValue(final float maxValue) {
        Random rand = new Random();
        return rand.nextFloat(maxValue);
    }

    public char getRandomChar(final int maxValue) {
        int radix = 10;
        Random rand = new Random();
        return Character.forDigit(rand.nextInt(100), radix);
    }

    public String getWord(int index) {

        String array[] = new String[] { "hola", "mundo", "casa", "carro", "avion" };
        return array[index];

    }

    public String getDateExample() {
        return "18/05/2022 15:33 p.m.";
    }

    public String getNameExample() {
        Random rand = new Random();
        int value = rand.nextInt(5);
        String name = "";
        switch (value) {
            case 1:
                name = "Luis";
                break;
            case 2:
                name = "Maria";
                break;
            case 3:
                name = "Pepe";
                break;
            case 4:
                name = "Lorena";
                break;
            case 5:
                name = "Marco";
                break;
            default:
                name = "Mario";
                break;

        }
        return name;
    }

    public String getActivityExample() {
        Random rand = new Random();
        int value = rand.nextInt(5);
        String name = "";
        switch (value) {
            case 1:
                name = "Correr";
                break;
            case 2:
                name = "Saltar";
                break;
            case 3:
                name = "Nadar";
                break;
            case 4:
                name = "Volar";
                break;
            case 5:
                name = "Hablar";
                break;
            default:
                name = "Mover";
                break;

        }
        return name;
    }

    public String getroleExample() {
        Random rand = new Random();
        int value = rand.nextInt(5);
        String name = "";
        switch (value) {
            case 1:
                name = "user";
                break;
            case 2:
                name = "administrator";
                break;
            case 3:
                name = "consultant";
                break;
            case 4:
                name = "editor";
                break;
            case 5:
                name = "copy";
                break;
            default:
                name = "delete";
                break;

        }
        return name;
    }

}
