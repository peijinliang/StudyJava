package com.java.study.interfaceclass;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/

public class InterfaceMain {

    public static void main(String[] args) {
        IMessage message = new MessageImpl();
        INews news = new NewImpl();
        message.print();
    }

}
