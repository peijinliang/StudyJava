package com.java.study.keyclass;

import com.java.study.multithreading.Data;

import java.util.Date;

/**
 * 非常重要的一个类
 * 取得当前时间对象实例。
 */

public class T_Date {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        long num = System.currentTimeMillis();
        System.out.println(new Date(num));

    }

}
