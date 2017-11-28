package com.java.study.bean;

/**
 * Crete by Marlon
 * Create Date: 11/27/2017
 * Class Describe
 **/
public class User {

    private String name;
    private String ID;
    private int age;

    public User() {

    }

    public User(int age) {
        this.age = age;
    }


    public static String getHH() {
        return "what fuck £¿";
    }

    public User(String name, String id, int age) {
        this.name = name;
        this.ID = id;
        this.age = age;
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
