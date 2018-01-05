package com.java.study.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Crete by Marlon
 * Create Date: 12/25/2017
 * Class Describe
 **/
public class TestAnnotation {

    public static void main(String[] args) {
        //类注解
//        test1();
//        test2();
        //方法注解
//        test3();
//        test4();
//        //参数注解
//        test5();
        // 变量注解
        test6();
        test7();
    }

    public static void test1() {
        Class tClass = MyTestClass.class;
        Annotation[] annotations = tClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof ClassAnnotation) {
                ClassAnnotation myAnnotation = ((ClassAnnotation) annotation);
                System.out.println("name:" + myAnnotation.name());
                System.out.println("value" + myAnnotation.value());
            }
        }
    }

    public static void test2() {
        Class tClass = MyTestClass.class;
        Annotation annotation = tClass.getAnnotation(ClassAnnotation.class);
        if (annotation instanceof ClassAnnotation) {
            ClassAnnotation myAnnotation = (ClassAnnotation) annotation;
            System.out.println("name:" + myAnnotation.name());
            System.out.println("value" + myAnnotation.value());
        }
    }

    public static void test3() {
        MyTestMethod myTestMethod = new MyTestMethod();
        try {
            Method method = myTestMethod.getClass().getMethod("testMethod");
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof MethodAnnotation) {
                    MethodAnnotation methodAnnotation = (MethodAnnotation) annotation;
                    System.out.println("name" + methodAnnotation.name());
                    System.out.println("value" + methodAnnotation.value());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void test4() {
        MyTestMethod myTestMethod = new MyTestMethod();
        Method[] methods = myTestMethod.getClass().getMethods();
        Method method = methods[0];
        Annotation annotations = method.getDeclaredAnnotation(MethodAnnotation.class);
        if (annotations instanceof MethodAnnotation) {
            MethodAnnotation methodAnnotation = (MethodAnnotation) annotations;
            System.out.println("name" + methodAnnotation.name());
            System.out.println("value" + methodAnnotation.value());
        }
    }

    //参数注解
    public static void test5() {
        MyTestParameterClass myTestParameterClass = new MyTestParameterClass();
        Method[] methods = myTestParameterClass.getClass().getMethods();
        Method method = methods[0];
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Class[] parameterTypes = method.getParameterTypes();
        int i = 0;
        for (Annotation[] annotations : parameterAnnotations) {
            Class parameterType = parameterTypes[i++];
            for (Annotation annotation : annotations) {
                if (annotation instanceof ParameterAnnotation) {
                    ParameterAnnotation parameterAnnotation = (ParameterAnnotation) annotation;
                    System.out.println("param:" + parameterType.getName());
                    System.out.println("name:" + parameterAnnotation.name());
                    System.out.println("value:" + parameterAnnotation.value());
                    System.out.println("me:" + parameterAnnotation.me());
                }
            }
        }
    }

    //参数注解(字段注解1）
    public static void test6() {
        MyTestFiledClass myTestFiledClass = new MyTestFiledClass();
        Field[] fields = myTestFiledClass.getClass().getFields();
        Field field = fields[0];
        try {
            field = myTestFiledClass.getClass().getField("myFiled");
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof FiledAnnotation) {
                    FiledAnnotation myAnnotation = (FiledAnnotation) annotation;
                    System.out.println("name: " + myAnnotation.name());
                    System.out.println("value: " + myAnnotation.value());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

    //参数注解(字段注解2）
    public static void test7() {
        MyTestFiledClass myTestFiledClass = new MyTestFiledClass();
        Field field;
        try {
            field = myTestFiledClass.getClass().getField("myFiled");
            Annotation annotation = field.getAnnotation(FiledAnnotation.class);
            if (annotation instanceof FiledAnnotation) {
                FiledAnnotation myAnnotation = (FiledAnnotation) annotation;
                System.out.println("name: " + myAnnotation.name());
                System.out.println("value: " + myAnnotation.value());
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }


}
