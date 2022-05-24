package com.co.ao.metadata;

import java.lang.reflect.InvocationTargetException;

public class Demo {

    public Demo(Integer a) {

    }

    public Demo() {

    }

    public static void suma(Integer a) {
        System.out.println(a);
    }

    public static void main(String[] args) {

        WHmetadata<Demo> metadata = new WHmetadata<Demo>();
        metadata.configuration(new Demo());
        Object atributos[] = new Object[1];
        atributos[0] = 5;
        metadata.Command("suma", atributos, Integer.class);
        Demo main = null;

        try {
            main = metadata.getNewInstance(atributos, Integer.class);
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }

        main.suma(9);

    }

}
