package com.java.study.bean;

/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe
 * ����Ҫʵ��Comparable �ӿ�
 **/
public class Person implements Comparable<Person> {

    private String name;
    private int age;

    private Integer mAge; // int �� Integer  ����������� int Ĭ����0  Integer Ĭ��Ϊ��


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

        Person per = (Person) obj;  //����ط���������ת�ͣ�ԭ������������������Ƶ�
        return this.name.equals(per.getName()) && this.age == per.getAge();
    }




//    @Override
//    public int compareTo(Person person) {
//        if (this.age > person.age) {
//            return 1; //����
//        } else if (this.age < person.age) {
//            return -1;
//        } else {
//            return 0;  // ȫ�������Խ��бȽ�
//        }
//    }



    @Override
    public int compareTo(Person person) {
        if (this.age > person.age) {
            return 1; //����
        } else if (this.age < person.age) {
            return -1;
        } else {
            return this.name.compareTo(person.getName()) ;
        }
    }



}
