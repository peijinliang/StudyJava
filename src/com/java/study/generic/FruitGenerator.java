package com.java.study.generic;

import java.util.Random;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe 水果泛型类 实现了抽象泛型接口 next()
 **/
public class FruitGenerator implements GenericInterface<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }


}
