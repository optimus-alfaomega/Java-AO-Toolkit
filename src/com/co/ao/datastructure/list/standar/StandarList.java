package com.co.ao.datastructure.list.standar;

import java.util.ArrayList;
import java.util.List;

import com.co.ao.datastructure.list.interfaces.IList;

public class StandarList<T> implements IList<T> {

    private List<T> list;

    public StandarList() {
        this.list = new ArrayList<T>();
    }

    public StandarList(List<T> list) {
        this.list = list;
    }

    @Override
    public int Size() {

        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public boolean addValue(T valor) {

        int oldSize = this.list.size();
        this.list.add(valor);
        int newSize = this.list.size();
        return oldSize < newSize ? true : false;

    }

    @Override
    public boolean deleteValue(T valor) {
        int oldSize = this.list.size();
        this.list.remove(valor);
        int newSize = this.list.size();
        return oldSize > newSize ? true : false;

    }

    @Override
    public boolean replaceValue(T oldValue, T newValue) {

        int index = this.list.indexOf(oldValue);
        T oldElement = this.list.get(index);
        this.list.add(index, newValue);

        return !oldElement.equals(newValue);
    }

    @Override
    public T find(T value) {

        if (this.list.contains(value)) {
            Integer index = this.list.indexOf(value);
            return this.list.get(index);
        }
        return null;
    }

    @Override
    public boolean exist(T value) {
        return this.list.contains(value);
    }

    @Override
    public int count() {
        return this.list.size();
    }

}
