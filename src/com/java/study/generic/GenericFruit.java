package com.java.study.generic;

/**
 * Crete by Marlon
 * Create Date: 2018/7/3
 * Class Describe
 **/

public class GenericFruit {

    static class Fruit{
        @Override
        public String toString() {
            return "fruit";
        }
    }

    static class Apple extends Fruit{
        @Override
        public String toString() {
            return "apple";
        }
    }

    static class Person{
        @Override
        public String toString() {
            return "Person";
        }
    }

    static class GenerateTest<T>{

        public void show_1(T t){
            System.out.println(t.toString());
        }

        //�ڷ�������������һ�����ͷ�����ʹ�÷���E�����ַ���E����Ϊ�������͡�����������T��ͬ��Ҳ���Բ�ͬ��
        //���ڷ��ͷ�����������ʱ�����������<E>����˼�ʹ�ڷ������в�δ�������ͣ�������Ҳ�ܹ���ȷʶ���ͷ�����ʶ��ķ��͡�

        public <E> void show_3(E t){
            System.out.println(t.toString());
        }

        //�ڷ�������������һ�����ͷ�����ʹ�÷���T��ע�����T��һ��ȫ�µ����ͣ������뷺������������T����ͬһ�����͡�

        public <T> void show_2(T t){
            System.out.println(t.toString());
        }

    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Person person = new Person();

        GenerateTest<Fruit> generateTest = new GenerateTest<Fruit>();
        //apple��Fruit�����࣬�����������
        generateTest.show_1(apple);
        //�������ᱨ����Ϊ��������ʵ��ָ������Fruit���������ʵ������Person
        //generateTest.show_1(person);

        //ʹ�����������������Գɹ�
        generateTest.show_2(apple);
        generateTest.show_2(person);

        //ʹ������������Ҳ�����Գɹ�
        generateTest.show_3(apple);
        generateTest.show_3(person);

    }
}
