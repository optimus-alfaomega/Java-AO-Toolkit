package com.co.ao.tools.matrix.interfaces;

import com.co.ao.datastructure.matrix.Interface.IMatrix;

public interface IMath<T> {

    public int additionColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int additionRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int addition(T... args);

    public int restColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int restRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int rest(T... args);

    public int multColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int multRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int multiplication(T... args);

    public double division(T arg1, T arg2);

}
