package com.java.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Crete by Marlon
 * Create Date: 12/25/2017
 * Class Describe
 * 自定义java 注解类
 * 注解本身就是：一种注释或者说是一种元数据
 * 范围：编译期使用预编译工具进行处理（pre-compiler tools），也可以在运行期使用 Java 反射机制进行处理。
 * 类注解
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassAnnotation {

    public String name();

    public String value();

}
