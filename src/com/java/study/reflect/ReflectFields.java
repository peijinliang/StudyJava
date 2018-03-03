package com.java.study.reflect;

import java.lang.reflect.Field;


/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * �����Ա  ��Ա����
 * û�з������ ���������п�ܶ�����
 **/

public class ReflectFields {


    public static void main(String[] args) {
        try {

            Class<?> cls = Class.forName("com.java.study.reflect.Student");
            Object obj = cls.newInstance();   //�κ�����µ������е���ͨ������������ʵ��������
//            cls.getFields(); //ȡ������ȫ��������
//            cls.getField("234234"); //ȡ������ָ��������

            {  //��ͨ�����
                Field[] fields = cls.getFields(); //ȡ��ȫ������  �������� public
                for (int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i]);
                }
            }

            System.out.println("-----------------------------");
            {
                Field[] fields = cls.getDeclaredFields(); //ȡ��ȫ������  ��ñ�������
                for (int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i]);
                }
            }

            //ͨ������������
            Field nameField = cls.getDeclaredField("number");
            nameField.setAccessible(false);  // ȡ����װ��
            nameField.set(obj, "44456545444"); // student.setNumber()
            System.out.println(nameField.get(obj)); //��ȡ����

            System.out.println(nameField.getType().getName());

            System.out.println(nameField.getType().getSimpleName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {   //�Ƿ��ķ���Ȩ��
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


    }


}
