package com.java.study.util;

import com.java.study.bean.Message;

/**
 * Crete by Marlon
 * Create Date: 2018/2/26
 * Class Describe
 **/
public class MessageConsumer {

    public void pirnt(Message messsage) {
        //������ȷ����Message�����
        System.out.println(Thread.currentThread().getName() + "   " + messsage.getNote());
    }


    public void pirnt() {
        //������ȷ����Message�����
        System.out.println(Thread.currentThread().getName() + "   " + MyUtil.get().getNote());
    }


}
