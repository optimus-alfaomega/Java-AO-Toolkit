package com.co.ao.tools.test.main;

public interface IMainTools {

    public void init();

    public abstract void init(String... args);

    public void close();

    public abstract void posExec();

    public abstract void exec();

    public String readInput(String message);

    public String readInput(String message, String arg);

    public boolean writeOutput(String message);

    public Integer convertoInteger(String value);

    public Float convertoFloat(String value);

    public Double convertoDouble(String value);

    public char convertoChar(String value);

}
