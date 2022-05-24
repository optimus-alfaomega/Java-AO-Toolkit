package com.co.ao.datastructure.queue.standar;

import java.util.LinkedList;
import java.util.Queue;

import com.co.ao.datastructure.queue.interfaces.IQueue;

public class StandarQueue<T> implements IQueue<T> {

    private Queue<T> queue;

    public StandarQueue() {
        queue = new LinkedList<T>();
    }

    public StandarQueue(Queue<T> queue) {
        this.queue = queue;
    }

    @Override
    public int Size() {
        return this.queue.size();
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override
    public boolean addValue(T valor) {
        int oldSize = this.queue.size();
        this.queue.offer(valor);
        int newSize = this.queue.size();
        return oldSize < newSize ? true : false;
    }

    @Override
    public T getHead() {
        return this.queue.poll();
    }

    @Override
    public boolean replaceValue(T oldValue, T newValue) {

        for (T value : this.queue) {
            value = value.equals(oldValue) ? newValue : value;
        }
        return true;
    }

    @Override
    public T find(T value) {
        if (this.queue.contains(value)) {
            for (T value1 : this.queue) {
                T Reference = value.equals(value1) ? value : null;
                if (Reference != null) {
                    return Reference;
                }
            }
        }

        return null;
    }

    @Override
    public boolean exist(T value) {
        return this.queue.contains(value);
    }

    @Override
    public int count() {
        return this.queue.size();
    }

}
