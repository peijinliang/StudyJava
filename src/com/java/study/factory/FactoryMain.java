package com.java.study.factory;

/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe
 **/
public class FactoryMain {


    public static void main(String[] args) {

//        System.out.println(Apple.class.getName());
//        Fruits fruits = FruitsFactory.getInstances(Apple.class.getName());
//        fruits.eat();

        Fruits apple = Factory.getInstances(Apple.class.getName());
        apple.eat();


        Message message = Factory.getInstances(MessageImpl.class.getName());
        message.print();
    }


}
