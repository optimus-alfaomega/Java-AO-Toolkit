package com.co.ao.datastructure.tree;

public interface ITree<T> {

    public int Size();

    public boolean isEmpty();

    public boolean addValue(T valor);

    public boolean deleteValue(T valor);

    public boolean replaceValue(T oldValue, T newValue);

    public T find(T value);

    public boolean exist(T value);

    public int count();

}
