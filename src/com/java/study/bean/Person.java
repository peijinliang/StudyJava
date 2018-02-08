package com.java.study.bean;

/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe
 * 排序要实现Comparable 接口
 **/
public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                       "name='" + name + '\'' +
                       ", age=" + age +
                       '}';
    }


    @Override
    public int compareTo(Person person) {
        if (this.age > person.age) {
            return 1; //大于
        } else if (this.age < person.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
