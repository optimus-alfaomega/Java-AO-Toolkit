package com.co.ao.tools.test.input;

import java.util.HashMap;

public class HashExample {

    public HashMap<String, Integer> getHashIntegers() {

        HashMap<String, Integer> integers = new HashMap<String, Integer>();
        integers.put("A1", 1);
        integers.put("B1", 2);
        integers.put("C1", 3);
        integers.put("D1", 4);

        integers.put("A2", 5);
        integers.put("B2", 6);
        integers.put("C2", 7);
        integers.put("D2", 8);

        integers.put("A3", 9);
        integers.put("B3", 10);
        integers.put("C3", 11);
        integers.put("D3", 12);

        integers.put("A4", 13);
        integers.put("B4", 14);
        integers.put("C4", 15);
        integers.put("D4", 16);

        integers.put("A5", 17);
        integers.put("B5", 18);
        integers.put("C5", 19);
        integers.put("D5", 20);

        return integers;

    }

    public HashMap<String, String> getHashTablesPerson() {

        HashMap<String, String> integers = new HashMap<String, String>();
        integers.put("A1", "nombre");
        integers.put("B1", "apellido");
        integers.put("C1", "dirección");
        integers.put("D1", "telefono");

        integers.put("A2", "Martin");
        integers.put("B2", "Lopez");
        integers.put("C2", "cra 123 # 28-39");
        integers.put("D2", "300123456");

        return integers;

    }

    public HashMap<String, String> getHashTablesRelation() {

        HashMap<String, String> integers = new HashMap<String, String>();
        integers.put("A1", "usuarios");
        integers.put("B1", "200");
        integers.put("A2", "ingresos");
        integers.put("B2", "150");
        integers.put("A3", "Sesiones finalizadas");
        integers.put("B3", "20");

        return integers;

    }
}
