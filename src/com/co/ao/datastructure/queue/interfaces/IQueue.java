package com.co.ao.datastructure.queue.interfaces;

public interface IQueue<T> {
    public int Size();

    public boolean isEmpty();

    public boolean addValue(T valor);

    public T getHead();

    public boolean replaceValue(T oldValue, T newValue);

    public T find(T value);

    public boolean exist(T value);

    public int count();

}
