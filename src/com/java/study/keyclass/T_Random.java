package com.java.study.keyclass;

import java.util.Random;

/**
 * Crete by Marlon
 * Create Date: 2018/2/7
 * Class Describe
 * �������
 **/

public class T_Random {


    public static void main(String[] args) {
        char[] data = new char[]{'a', 'b', 'c', 'e', 'u', 'g'};
        Random random = new Random();
        for (int i = 0; i < 4; i++) { //100��ʾ���ֵ  1-99
            System.out.println(data[random.nextInt(4)]);
        }
//        IntgerRandom();
    }


    //�������
    public static void IntgerRandom() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) { //100��ʾ���ֵ  1-99
            System.out.println(random.nextInt(100));
        }
    }



}
