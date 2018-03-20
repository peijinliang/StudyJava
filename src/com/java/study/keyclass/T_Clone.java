package com.java.study.keyclass;

import com.java.study.reflect.Person;

/**
 * 对象克隆
 * Object 本身就有colne 方法
 * 对象可以随便进行克隆，前提是必须实现 Cloneable  interface
 * 否则抛出CloneNotSupportedException
 * <p>
 * 对象的克隆实现
 * 关键标识接口
 */

public class T_Clone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person("what fuck ?", 20);
        Person perA = (Person) person.clone();
        perA.setAge(30);
        System.out.println("person:" + person.toString());
        System.out.println("personA:" + perA.toString());

    }

}
