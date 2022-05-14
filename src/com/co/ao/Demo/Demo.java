package com.co.ao.Demo;

import com.co.ao.tools.scalar.math.Sum;
import com.co.ao.tools.matrix.out.*;
import com.co.ao.tools.matrix.out.Print;
import com.co.ao.tools.array.*;

public class Demo {
    public static void main(String[] args) {

        Integer Matrix[][] = new Integer[][] { { 1, 2 }, { 3, 3 } };
        Integer values[] = new Integer[] { 1, 2, 3 };

        System.out.println(Sum.getSum().add(1, 2));
        Sum.between().values(1, 2);
        Sum.calcular().entre(1, 5);

        // Impresion.porPantalla().de(Matrix);
        Print.byScreen().of(Matrix);

        com.co.ao.tools.array.out.Impresion.porPantalla().de(values);
        com.co.ao.tools.scalar.out.Impresion.porPantalla().de(3);

    }
}
