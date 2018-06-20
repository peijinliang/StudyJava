package com.java.study.interfaceclass;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class MessageImpl implements INews, IMessage {

    @Override
    public void print() {
        System.out.println(IMessage.MSG);
    }

    @Override
    public String get() {
        return IMessage.MSG;
    }


}
