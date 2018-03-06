package com.java.study.reflect.loader;

/**
 * Crete by Marlon
 * Create Date: 2018/3/3
 * Class Describe
 * 类加载路径可能是网络、文件、数据库
 * Class.forName()   路径加载  classpath
 * <p>
 * ClassLoader 类加载器的操作信息
 **/

public class ClassLoaderTest {

    public static void main(String[] args) {
        Class<?> cls = Member.class;
        System.out.println(cls.getClassLoader());   //两个雷加载器   sun.misc.Launcher$AppClassLoader@18b4aac2  应用程序加载器
        System.out.println(cls.getClassLoader().getParent());  // sun.misc.Launcher$ExtClassLoader@4554617c  扩展类加载类
        System.out.println(cls.getClassLoader().getParent().getParent());
    }


}
