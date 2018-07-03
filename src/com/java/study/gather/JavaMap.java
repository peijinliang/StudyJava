package com.java.study.gather;


import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * Crete by Marlon
 * Create Date: 2017/11/9
 * Class Describe javaMap原理
 **/
public class JavaMap {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("1", "Ok1");
        hashMap.put("2", "Ok2");
        hashMap.put("3", "Ok3");
        hashMap.put("4", "Ok4");
        hashMap.put("5", "Ok5");
        hashMap.put("6", "Ok6");
        hashMap.put("7", "Ok7");
        hashMap.put("8", "Ok8");

        hashMap.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {

            }
        });

        // Strom 数据流编程 java 金融公司

    }

}
