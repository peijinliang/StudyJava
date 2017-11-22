package com.java.study.reflect;

import java.util.ArrayList;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: 11/17/2017
 * Class Describe
 **/
public class Person implements Action {

    private String name;
    private int age;
    private String head;
    protected List<String> stringList = new ArrayList<>();
    private String privateString = null;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String head) {
        this.name = name;
        this.age = age;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("´òÓ¡²ÎÊý£º" + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Person{" +
                       "name='" + name + '\'' +
                       ", age=" + age +
                       ", head='" + head + '\'' +
                       '}';
    }


    public Person(String name, String privateString) {
        this.name = name;
        this.privateString = privateString;
    }


    public void setPrivateString(String privateString) {
        this.privateString = privateString;
    }

    private String getPrivateString() {
        return this.privateString;
    }


    public List<String> getStringList() {
        return this.stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void rotate() {

    }

}
