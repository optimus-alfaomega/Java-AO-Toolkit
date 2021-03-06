package com.co.ao.datastructure.matrix.excel;

import com.co.ao.datastructure.matrix.Interface.Irow;
import com.co.ao.metadata.WHmetadata;

public class Row<T> extends WHmetadata<Row> implements Irow {

    private String column;
    private int row;
    private T value;

    public Row() {
        this.configuration(this);
    }

    public void setValue(T value, String column, int row) {
        this.value = value;
        this.column = column;
        this.row = row;
    }

    @Override
    public T getValue() {
        return value;
    }

    public String getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }

    public void setColumn(final String column) {
        this.column = column;
    }

    public void setRow(final int row) {
        this.row = row;
    }

    public String toString() {
        return "" + this.value + " " + this.column + " " + this.row + " ";
    }

}
