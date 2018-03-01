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

    private Integer mAge; // int 和 Integer  最大的区别就是 int 默认是0  Integer 默认为空


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
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person per = (Person) obj;  //这个地方可以向下转型，原因这个类是由你来控制的
        return this.name.equals(per.getName()) && this.age == per.getAge();
    }




//    @Override
//    public int compareTo(Person person) {
//        if (this.age > person.age) {
//            return 1; //大于
//        } else if (this.age < person.age) {
//            return -1;
//        } else {
//            return 0;  // 全部的属性进行比较
//        }
//    }



    @Override
    public int compareTo(Person person) {
        if (this.age > person.age) {
            return 1; //大于
        } else if (this.age < person.age) {
            return -1;
        } else {
            return this.name.compareTo(person.getName()) ;
        }
    }



}
