package com.java.study.keyclass;

import com.java.study.multithreading.Data;

import java.util.Date;

/**
 * �ǳ���Ҫ��һ����
 * ȡ�õ�ǰʱ�����ʵ����
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
