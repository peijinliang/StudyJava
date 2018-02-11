package com.java.study.factory;

/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe
 **/
public class MessageImpl implements Message {
    @Override
    public void print() {
        System.out.println("打印 一些 东西");
    }
}
