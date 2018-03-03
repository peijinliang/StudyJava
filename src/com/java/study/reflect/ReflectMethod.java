package com.java.study.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * ��������
 * ����Ը��ݷ�������ȡ��Class ��������Ϣ
 * �����������
 **/
public class ReflectMethod {

    public static void main(String[] args) {
//        Class<?> cls = Person.class;
//        Method[] method = cls.getMethods(); //ȡ��ȫ������  �����������еķ���
//        for (int i = 0; i < method.length; i++) {
//            System.out.println(method[i]);
//        }

//      private String name;
//      private int age;

        //�������
        //ͨ������������ get �� set
        try {
            String name = "name";
            String value = "XiaoMing";
            //Class.forName("com.java.study.reflect.Person")
            Class<?> cls = Person.class;
            Object obj = cls.newInstance();   //�κ�����µ������е���ͨ������������ʵ��������    �޲ι��췽��
            //setName()�Ƿ������ƣ�����������������Ǹ��ݸ�����������Ϣƴ�յ����ġ��÷�����Ҫ����һ��String ���͵Ĳ���
            Method setMethod = cls.getMethod("set" + initcap(name), java.lang.String.class);
            //������Method����󷽷�����ָ���ķ���
            setMethod.invoke(obj, value);  //�൱��Person.setName(value);

            Method getMethod = cls.getMethod("get" + initcap(name));
            Object ret = getMethod.invoke(obj); //Person.getName();
            System.out.println(ret);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }


    public static String initcap(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
