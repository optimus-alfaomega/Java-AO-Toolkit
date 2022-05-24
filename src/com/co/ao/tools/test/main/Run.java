package com.co.ao.tools.test.main;

import java.lang.reflect.InvocationTargetException;

import com.co.ao.metadata.WHmetadata;
import com.co.ao.tools.scalar.out.Impresion;
import com.co.ao.tools.scalar.math.Sum;

public class Run extends MainTools {

    public static void main(String[] args) {

        Run t = new Run();
        Integer resp = 0;
        t.init("valor1", "valor2");

        t.exec();
        t.exec2("Sumar");
        // t.posExec();
        /*
         * try {
         * Run RunInstance = new Run();
         * resp = (Integer) t.getClass().getMethod("Sumar", Integer.class,
         * Integer.class).invoke(RunInstance, 1, 2);
         * Impresion.porPantalla().de(resp);
         * } catch (IllegalAccessException | IllegalArgumentException |
         * InvocationTargetException | NoSuchMethodException
         * | SecurityException e) {
         * e.printStackTrace();
         * }
         */
    }

    public void init(String... messages) {
        this.setMessages(messages);
        String[] args = new String[messages.length];

        for (int index = 0; index < messages.length; index++) {
            args[index] = readInput(messages[index]);
        }
        this.setArgs(args);

    }

    @Override
    public void exec() {
        String args[] = this.getArgs();
        String output[] = new String[1];
        Integer result = this.Sumar(this.convertoInteger(args[0]),
                this.convertoInteger(args[1]));
        output[0] = result + "";
        this.setOutputs(output);
    }

    public void exec2(String methodo) {
        String args[] = this.getArgs();
        ///////////////////////////////////////////////////// 7
        Integer argsInt[] = new Integer[args.length];
        argsInt[0] = Integer.parseInt(args[0]);
        argsInt[1] = Integer.parseInt(args[1]);
        ///////////////////////////////////////////////////////////////// 7
        String outputs[] = new String[1];
        Object output = this.Command(methodo, argsInt, Integer.class, Integer.class);
        Integer conversion = Integer.class.cast(output);
        System.out.println(conversion + "conversion");
        outputs[0] = conversion + "";
        this.setOutputs(outputs);
    }

    @Override
    public void posExec() {
        this.writeOutput("resultado de suma: ");
        this.close();
    }

    public Integer Sumar(Integer val1, Integer val2) {
        return Sum.between().add(val1, val2);
    }

}
