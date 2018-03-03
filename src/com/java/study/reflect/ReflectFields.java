package com.java.study.reflect;

import java.lang.reflect.Field;


/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * 反射成员  成员属性
 * 没有反射机制 基本上所有框架都反射
 **/

public class ReflectFields {


    public static void main(String[] args) {
        try {

            Class<?> cls = Class.forName("com.java.study.reflect.Student");
            Object obj = cls.newInstance();   //任何情况下调用类中的普通方法都必须有实例化对象
//            cls.getFields(); //取得类中全部的属性
//            cls.getField("234234"); //取得类中指定的属性

            {  //普通代码块
                Field[] fields = cls.getFields(); //取得全部属性  包括父类 public
                for (int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i]);
                }
            }

            System.out.println("-----------------------------");
            {
                Field[] fields = cls.getDeclaredFields(); //取得全部属性  获得本类属性
                for (int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i]);
                }
            }

            //通过反射来调用
            Field nameField = cls.getDeclaredField("number");
            nameField.setAccessible(false);  // 取消封装了
            nameField.set(obj, "44456545444"); // student.setNumber()
            System.out.println(nameField.get(obj)); //获取属性

            System.out.println(nameField.getType().getName());

            System.out.println(nameField.getType().getSimpleName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {   //非法的访问权限
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


    }


}
