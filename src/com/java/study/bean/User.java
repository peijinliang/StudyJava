package com.java.study.bean;

import java.io.Serializable;

/**
 * Crete by Marlon
 * Create Date: 11/27/2017
 * Class Describe
 **/
public class User implements Serializable {

    private String name;
    private String ID;
    private int age;
    transient private String work;  //  transient  序列化的时候跳过

    public User() {

    }

    public User(int age) {
        this.age = age;
    }


    public static String getHH() {
        return "what fuck ？";
    }

    public User(String name, String id, int age) {
        this.name = name;
        this.ID = id;
        this.age = age;
    }

    public User(String name, String id, int age, String work) {
        this.name = name;
        this.ID = id;
        this.age = age;
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "User{" +
                       "name='" + name + '\'' +
                       ", ID='" + ID + '\'' +
                       '}';
    }
}
