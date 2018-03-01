package com.java.study.util;

import com.java.study.bean.Message;

/**
 * Crete by Marlon
 * Create Date: 2018/2/26
 * Class Describe
 **/
public class MessageConsumer {

    public void pirnt(Message messsage) {
        //必须明确接受Message类对象
        System.out.println(Thread.currentThread().getName() + "   " + messsage.getNote());
    }


    public void pirnt() {
        //必须明确接受Message类对象
        System.out.println(Thread.currentThread().getName() + "   " + MyUtil.get().getNote());
    }


}
