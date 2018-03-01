package com.java.study.keyclass;

/**
 * Java Runtime类学习
 * 观察我们内存的操作情况
 * freeMemory()  当前空余内存空间大小
 * totalMemory() 当前可以使用内存总空间大小
 * maxMemory()  最大内存可用空间大小
 * <p>
 * 最为重要的方法就是：gc() 垃圾回收机制 回收对象
 * 什么是GC :
 * Garbage Collector: 垃圾收集器
 * 两种处理方式：（手工调用）
 * 1、自动不定期进行调用。
 * 2、runtime.gc();
 */

public class T_Runtime {

    public static void main(String[] args) {
//        Runtime runtime = new Runtime();  构造方法被私有化

        //单例设计模式
        Runtime runtime = Runtime.getRuntime();


        System.out.println("1.MAX = " + byteTom(runtime.maxMemory()));
        System.out.println("1.TOTAL = " + byteTom(runtime.totalMemory()));
        System.out.println("1.FREE = " + byteTom(runtime.freeMemory()));
        System.out.println("运行程序：------------------------");
        String str = "";

        for (int i = 0; i < 99999; i++) {
            str += i;
        }

        System.out.println("2.MAX = " + byteTom(runtime.maxMemory()));
        System.out.println("2.TOTAL = " + byteTom(runtime.totalMemory()));
        System.out.println("2.FREE = " + byteTom(runtime.freeMemory()));

        runtime.gc(); //调用JVM 垃圾回收机制
        System.out.println("调用垃圾回收机制：------------------------");
        System.out.println("3.MAX = " + byteTom(runtime.maxMemory()));
        System.out.println("3.TOTAL = " + byteTom(runtime.totalMemory()));
        System.out.println("3.FREE = " + byteTom(runtime.freeMemory()));


    }

    public static double byteTom(long num) {
        return (double) num / 1024 / 1024;
    }


}
