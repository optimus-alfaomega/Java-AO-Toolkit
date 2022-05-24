package com.co.ao.datastructure.hash.standar;

import java.util.HashMap;
import java.util.Map;

import com.co.ao.datastructure.hash.interfaces.IHash;

public class Hash<T> implements IHash<T> {

    Map<String, T> map;

    public Hash() {
        this.map = new HashMap<String, T>();
    }

    public Hash(Map<String, T> map) {
        this.map = map;
    }

    @Override
    public int hashSize() {
        int size = this.map.size();
        return size;
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean addValue(String key, T valor) {
        int oldSize = this.map.size();
        this.map.put(key, valor);
        int newSize = this.map.size();
        return newSize > oldSize ? true : false;
    }

    @Override
    public boolean deleteValue(String key) {
        int oldSize = this.map.size();
        this.map.remove(key);
        int newSize = this.map.size();
        return oldSize > newSize ? true : false;

    }

    @Override
    public boolean replaceValue(String key, T valor) {
        T oldValue = this.map.get(key);
        this.map.replace(key, valor);
        T newValue = this.map.get(key);
        return !oldValue.equals(newValue);
    }

    @Override
    public T findbyKey(String key) {
        return this.map.get(key);
    }

    @Override
    public boolean existKey(String key) {
        return this.map.keySet().contains(key);
    }

    @Override
    public int count() {

        return this.map.size();

    }

}
