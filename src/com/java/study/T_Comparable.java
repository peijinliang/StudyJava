package com.java.study;

import com.java.study.bean.Person;

import java.util.Arrays;

/**
 * Crete by Marlon
 * Create Date: 2018/2/7
 * Class Describe
 * Comparable  ʵ�ֶ�����������
 **/
public class T_Comparable {

    public static void main(String[] args) {
        Person person[] = new Person[]{
                new Person("����", 10),
                new Person("����", 30),
                new Person("����", 21),
                new Person("����", 11)
        };
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }


}
