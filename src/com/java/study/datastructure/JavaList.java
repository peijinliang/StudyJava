package com.java.study.datastructure;

import com.java.study.bean.Person;

import java.util.*;

/**
 * Crete by Marlon
 * Create Date: 2017/11/9
 * Class Describe
 * Vector 和 ArrayList 区别：
 * 历史事件：java  1.0  1.2
 * Vector 同步处理,效率低      线程安全
 * ArrayList 异步处理,效率高   线程不安全
 * <p>
 * <p>
 * <p>
 * LinkedList 和 ArrayList 区别
 * ArrayList 封装的数组        时间复杂度为1
 * LinkedList 封装的Note链表   时间复杂度为N  线性
 * <p>
 * Hash 算法概念
 * 举例： 你公园玩耍，有很多座位
 **/

public class JavaList {


    public static void main(String[] args) {

//        list.contains();
//        list.iterator();

        //  开发建议传入initialCapacity 初始化大小
        ArrayList<String> list = new ArrayList<>(5);

        list.add("what fuck?");
        list.add("what fuck?");
        System.out.println(list.toString());


        //不允许重复  没有对Coolection J进行扩充
        Set<String> hashSet = new HashSet<String>();  //无序存储
        hashSet.add("Hello");
        hashSet.add("Hello");
        hashSet.add("Hello");
        hashSet.add("Marlon");
        System.out.println(hashSet.toString());


        Set<String> treeSet = new TreeSet<>();    //有序存储  所有的属性都进行比较
        treeSet.add("Hello");
        treeSet.add("AAAAA");
        treeSet.add("Hello");
        treeSet.add("Marlon");
        System.out.println(treeSet.toString());


        Set<Person> personSet = new TreeSet<>();    //有序存储   TreeSet 是需要Comparable 实现
        personSet.add(new Person("夏红", 1));
        personSet.add(new Person("小明", 30));
        personSet.add(new Person("小气", 4));
        personSet.add(new Person("小的", 2));
        personSet.add(new Person("阿", 30));
        System.out.println(personSet.toString());

        LinkedList<String> linkedList = new LinkedList<>();

        Vector<String> vector = new Vector<>();


    }


}
