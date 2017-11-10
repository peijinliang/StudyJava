package com.java.study.generic;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe
 **/
public class User {

    private String name;
    private String id;
    private String head;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }


    @Override
    public String toString() {
        return "User{" +
                       "name='" + name + '\'' +
                       ", id='" + id + '\'' +
                       ", head='" + head + '\'' +
                       '}';
    }
}
