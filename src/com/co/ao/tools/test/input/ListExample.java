package com.co.ao.tools.test.input;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public List<Integer> getListIntegers(int maxValue) {

        List<Integer> lista = new ArrayList<Integer>();
        Random rand = new Random();
        for (int index = 0; index < maxValue; index++) {
            lista.add(rand.nextInt(maxValue));
        }
        return lista;
    }

    public List<Float> getListFloat(int maxValue) {

        List<Float> lista = new ArrayList<Float>();
        Random rand = new Random();
        for (int index = 0; index < maxValue; index++) {
            lista.add(rand.nextFloat(maxValue));
        }
        return lista;
    }

    public List<Double> getListDouble(int maxValue) {

        List<Double> lista = new ArrayList<Double>();
        Random rand = new Random();
        for (int index = 0; index < maxValue; index++) {
            lista.add(rand.nextDouble(maxValue));
        }
        return lista;
    }

    public List<String> getListString() {

        List<String> lista = new ArrayList<String>();
        lista.add("Asador");
        lista.add("Casa");
        lista.add("Victoria");
        lista.add("volar");
        lista.add("Vacio");
        lista.add("Ambiente");
        lista.add("Diana");
        lista.add("Votacion");
        lista.add("Verde");
        lista.add("Gordo");

        return lista;
    }

    public List<String> getListCharactersMayus() {

        List<String> lista = new ArrayList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        lista.add("H");
        lista.add("I");
        lista.add("J");
        lista.add("K");
        lista.add("L");
        lista.add("M");
        lista.add("N");
        lista.add("O");
        lista.add("P");
        lista.add("Q");
        lista.add("R");
        lista.add("S");
        lista.add("T");
        lista.add("U");
        lista.add("V");
        lista.add("X");
        lista.add("Y");
        lista.add("Z");

        return lista;
    }

    public List<String> getListCharactersminus() {

        List<String> lista = new ArrayList<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");
        lista.add("f");
        lista.add("g");
        lista.add("h");
        lista.add("i");
        lista.add("j");
        lista.add("k");
        lista.add("l");
        lista.add("m");
        lista.add("n");
        lista.add("o");
        lista.add("p");
        lista.add("q");
        lista.add("r");
        lista.add("s");
        lista.add("t");
        lista.add("u");
        lista.add("v");
        lista.add("x");
        lista.add("y");
        lista.add("z");

        return lista;
    }

    public List<String> getListColors() {
        List<String> lista = new ArrayList<String>();
        lista.add("RED");
        lista.add("GREEN");
        lista.add("YELLOW");
        lista.add("BLACK");
        lista.add("WHITE");

        return lista;

    }

    public List<String> getListAnimals() {
        List<String> lista = new ArrayList<String>();
        lista.add("CAT");
        lista.add("DOG");
        lista.add("DONKEY");
        lista.add("MONKEY");
        lista.add("LION");

        return lista;

    }

}
