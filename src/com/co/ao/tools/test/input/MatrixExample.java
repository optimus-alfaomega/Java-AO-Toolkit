package com.co.ao.tools.test.input;

import java.util.Random;

//el objetivo es entregar elementos de ejemlo basicos como matices
public class MatrixExample {

    public MatrixExample() {
    }

    public Integer[][] getMatrix(final int sizex, final int sizey) {
        Integer Matrix[][] = new Integer[sizex][sizey];
        Random rand = new Random();

        for (int index = 0; index < sizex; index++) {
            for (int indey = 0; indey < sizey; indey++) {

                Matrix[index][indey] = rand.nextInt(100);
            }
        }

        return Matrix;
    }

}
