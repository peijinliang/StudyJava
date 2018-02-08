package com.java.study;

import com.java.study.bean.Person;

import java.util.Arrays;

/**
 * Crete by Marlon
 * Create Date: 2018/2/7
 * Class Describe
 * Comparable  实现对象数组排序
 **/
public class T_Comparable {

    public static void main(String[] args) {
        Person person[] = new Person[]{
                new Person("张三", 10),
                new Person("李四", 30),
                new Person("王五", 21),
                new Person("赵六", 11)
        };
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }


}
