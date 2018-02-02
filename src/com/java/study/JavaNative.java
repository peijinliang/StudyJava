package com.java.study;

/**
 * Crete by Marlon
 * Create Date: 12/1/2017
 * Class Describe
 * native关键字说明其修饰的方法是一个原生态方法
 * Java语言本身不能对操作系统底层进行访问和操作，但是可以通过JNI接口调用其他语言来实现对底层的访问。
 * JNI java native interface
 **/

public class JavaNative {

    public native void hello();

    static {
        System.loadLibrary("hello");
    }


    public static void main(String[] args) {
        new JavaNative().hello();
    }



}
