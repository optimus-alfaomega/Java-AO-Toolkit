package com.co.ao.tools.test.main;

import java.util.Scanner;

import com.co.ao.metadata.WHmetadata;
import com.co.ao.tools.scalar.out.Impresion;

public abstract class MainTools extends WHmetadata<MainTools> implements IMainTools {

    private String[] args;
    private String[] messages;
    private String[] outputs;
    private Scanner lectura;

    public MainTools() {
        this.configuration(this);
    }

    @Override
    public void init() {

    }

    @Override
    public abstract void init(String... messages);

    @Override
    public void close() {
        lectura = new Scanner(System.in);
        lectura.close();

    }

    @Override
    public abstract void posExec();

    @Override
    public abstract void exec();

    @Override
    public String readInput(String message) {

        lectura = new Scanner(System.in);
        System.out.println(message);
        String arg = lectura.next();

        return arg;
    }

    @Override
    public String readInput(String message, String arg) {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public boolean writeOutput(String message) {

        Impresion.porPantalla().de(message);

        for (int index = 0; index < this.outputs.length; index++) {
            Impresion.porPantalla().de(this.outputs[index]);
            Impresion.porPantalla().finLinea();
        }

        return true;
    }

    @Override
    public Integer convertoInteger(String value) {

        return Integer.parseInt(value);
    }

    @Override
    public Float convertoFloat(String value) {
        return Float.parseFloat(value);
    }

    @Override
    public Double convertoDouble(String value) {
        return Double.parseDouble(value);
    }

    @Override
    public char convertoChar(String value) {
        return value.charAt(0);
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public String[] getMessages() {
        return messages;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }

    public String[] getOutputs() {
        return outputs;
    }

    public void setOutputs(String[] outputs) {
        this.outputs = outputs;
    }

    public Scanner getLectura() {
        return lectura;
    }

    public void setLectura(Scanner lectura) {
        this.lectura = lectura;
    }

}
