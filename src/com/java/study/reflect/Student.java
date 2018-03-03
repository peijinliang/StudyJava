package com.java.study.reflect;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 **/
public class Student extends Person {

    public String number;
    private String headportrait;

    public Student(){

    }


    public Student(String name) {
        super(name);
    }

    public String getHeadportrait() {
        return headportrait;
    }

    public void setHeadportrait(String headportrait) {
        this.headportrait = headportrait;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Student{" +
                       "number='" + number + '\'' +
                       ", headportrait='" + headportrait + '\'' +
                       '}';
    }
}
