package com.java.study;

import java.util.Arrays;


/**
 * Crete by Marlon
 * Create Date: 2018/2/7
 * Class Describe
 * Array 学习
 **/
public class T_Array {


    public static void main(String[] args) {

        int dataA[] = new int[]{1, 2, 3, 4, 5, 10};

        int dataB[] = new int[]{1, 2, 3, 5, 5, 10};

        //简单的实验
        System.out.println(Arrays.toString(dataA));
        System.out.println(Arrays.equals(dataA, dataB));
        System.out.println(Arrays.binarySearch(dataA, 5));

    }

}
