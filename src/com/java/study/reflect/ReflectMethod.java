package com.java.study.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * 反射与类
 * 你可以根据反射来获取到Class 的所有信息
 * 这个类有问题
 **/
public class ReflectMethod {

    public static void main(String[] args) {
//        Class<?> cls = Person.class;
//        Method[] method = cls.getMethods(); //取得全部方法  包括类中所有的方法
//        for (int i = 0; i < method.length; i++) {
//            System.out.println(method[i]);
//        }

//      private String name;
//      private int age;

        //反射机制
        //通过反射来调用 get 和 set
        try {
            String name = "name";
            String value = "XiaoMing";
            //Class.forName("com.java.study.reflect.Person")
            Class<?> cls = Person.class;
            Object obj = cls.newInstance();   //任何情况下调用类中的普通方法都必须有实例化对象    无参构造方法
            //setName()是方法名称，但是这个方法名称是根据给定的属性信息拼凑得来的。该方法需要接受一个String 类型的参数
            Method setMethod = cls.getMethod("set" + initcap(name), java.lang.String.class);
            //随后根据Method类对象方法调用指定的方法
            setMethod.invoke(obj, value);  //相当于Person.setName(value);

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
