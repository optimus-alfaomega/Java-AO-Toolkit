package com.co.ao.tools.matrix.interfaces;

import com.co.ao.datastructure.matrix.Interface.IMatrix;

public interface IAnalisis<T> {

    public int averageColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int averageRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int average(T... args);

    public int findMaxColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int findMaxRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int findMax(T... args);

    public int findMinColumn(IMatrix<T> matrix, int fromColumn, int toColumn);

    public int findMinRow(IMatrix<T> matrix, int fromRow, int toRow);

    public int findMin(T... args);

}
