package com.java.study.generic;

import java.util.HashMap;
import java.util.Map;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe
 **/
public class GenericMore<T, K> extends Generic<T> {

    private K k;

    public GenericMore(T key) {
        super(key);
    }


    public <T, V> V getValue(Generic<T> container) {
        T key = container.getKey();
        System.out.println("contain key :" + key);
        Map<T, V> map = new HashMap<>();

        V value = map.get(key);
        return value;
    }


    public static void main(String[] args) {
        GenericMore m = new GenericMore("name");
        String value = (String) m.getValue(new Generic("key"));
        System.out.println(value);
    }


    public <T> void printMsg(T... args) {
        for (T t : args) {
            System.out.println("∑∫–Õ≤‚ ‘£∫t is " + t);
        }
    }


}
