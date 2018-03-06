package com.java.study.reflect.loader;

/**
 * Crete by Marlon
 * Create Date: 2018/3/3
 * Class Describe
 * �����·�����������硢�ļ������ݿ�
 * Class.forName()   ·������  classpath
 * <p>
 * ClassLoader ��������Ĳ�����Ϣ
 **/

public class ClassLoaderTest {

    public static void main(String[] args) {
        Class<?> cls = Member.class;
        System.out.println(cls.getClassLoader());   //�����׼�����   sun.misc.Launcher$AppClassLoader@18b4aac2  Ӧ�ó��������
        System.out.println(cls.getClassLoader().getParent());  // sun.misc.Launcher$ExtClassLoader@4554617c  ��չ�������
        System.out.println(cls.getClassLoader().getParent().getParent());
    }


}
