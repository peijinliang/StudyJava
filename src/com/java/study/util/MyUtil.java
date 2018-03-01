package com.java.study.util;

import com.java.study.bean.Message;

/**
 * Crete by Marlon
 * Create Date: 2018/2/26
 * Class Describe
 **/
public class MyUtil {

    private static ThreadLocal<Message> threadLocal = new ThreadLocal();

//  public static Message message;

    public static void set(Message msg) {
        threadLocal.set(msg);
    }

    public static Message get() {
        return threadLocal.get();
    }

}
