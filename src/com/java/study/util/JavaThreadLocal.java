package com.java.study.util;

import com.java.study.bean.Message;

/**
 * Crete by Marlon
 * Create Date: 2018/2/26
 * Class Describe
 * <p>
 * ThreadLocal 减少具体的引用传递
 **/
public class JavaThreadLocal {


    public static void main(String[] args) {
        new Thread(() -> {
            Message msg = new Message();
            msg.setNote("what't fuck the Thread!");
            MyUtil.set(msg);
            MessageConsumer messageConsumer = new MessageConsumer();
            messageConsumer.pirnt();
        }, "A").start();

        new Thread(() -> {
            Message msg = new Message();
            msg.setNote("这是什么线程？");
            MyUtil.set(msg);
            MessageConsumer messageConsumer = new MessageConsumer();
            messageConsumer.pirnt();
        }, "B").start();

    }


}
