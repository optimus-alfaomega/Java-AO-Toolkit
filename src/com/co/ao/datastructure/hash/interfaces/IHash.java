package com.co.ao.datastructure.hash.interfaces;

public interface IHash<T> {

    public int hashSize();

    public boolean isEmpty();

    public boolean addValue(String key, T valor);

    public boolean deleteValue(String key);

    public boolean replaceValue(String key, T valor);

    public T findbyKey(String key);

    public boolean existKey(String key);

    public int count();

}
