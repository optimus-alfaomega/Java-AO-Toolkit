package com.co.ao.metadata;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WHmetadata<T> {

    private T reference = null;

    public WHmetadata() {

    }

    public WHmetadata<T> configuration(T reference) {
        this.reference = reference;
        return this;
    }

    public WHmetadata<T> configuration() {
        return this;
    }

    public WHmetadata<T> Methods() {
        if (this.reference != null) {
            for (int index = 0; index < this.reference.getClass().getMethods().length; index++) {
                System.out.println(this.reference.getClass().getMethods()[index]);
            }
        } else {
            System.out.println("reference undefined");
        }
        return this;
    }

    public Object Command(String name, Object[] args, Class<?>... parameterTypes) {
        Object output = null;
        if (this.reference != null) {

            try {

                // this.reference.getClass().getMethod(name,
                // parameterTypes).invoke(this.reference, args);
                output = this.reference.getClass().getMethod(name, parameterTypes).invoke(this.reference, args);

            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
                    | NoSuchMethodException
                    | SecurityException e) {
                e.printStackTrace();
            }

        }
        return output;
    }

    public WHmetadata<T> packageName() {
        if (this.reference == null) {
            System.out.println("reference is null");
        } else
            System.out.println(this.reference.getClass().getPackageName());
        return this;
    }

    public WHmetadata<T> isInterface() {
        if (this.reference == null) {
            System.out.println("reference is null");
        } else
            System.out.println(this.reference.getClass().isInterface());
        return this;
    }

    public T getNewInstance(Object[] initArgs, Class<?>... parameterTypes)
            throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        T valor = (T) this.reference.getClass().getConstructor(parameterTypes).newInstance(initArgs);
        return valor;
    }

    public WHmetadata<T> className() {

        if (this.reference == null) {
            System.out.println("reference is null");
        } else {
            System.out.println(this.reference.getClass().getName());
        }
        return this;
    }

    public String toString() {

        return "@info: " + this.reference.getClass().getName() + ",  " + this.reference.getClass().getSimpleName();

    }

}
