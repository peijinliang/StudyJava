package com.java.study.io.autocloseable;

/**
 * Crete by Marlon
 * Create Date: 2018/3/14
 * Class Describe
 **/
public class Message implements AutoCloseable {

    public Message() {
        System.out.println("创建一条新的消息!");
    }

    public void print() throws Exception {
        System.out.println("print!");
       throw  new Exception("老子就是不关闭！");
    }

    @Override
    public void close() throws Exception {  //关闭的处理操作
        System.out.println("【AutoCloseable】 进行关闭的方法处理!");
    }

}
