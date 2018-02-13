package com.java.study.keyclass;

import com.java.study.reflect.Person;

/**
 * java.lang.System 类学习
 * static long	currentTimeMillis()
 * Returns the current time in milliseconds.
 * <p>
 * System.gc();垃圾回收方法
 * <p>
 * 面试题：
 * final、 finally 、 finalize
 * final:不能够被继承的父类、不能被重写的方法、不能被修改的常量
 * finally： 是异常处理的统一出口
 * finalize ： Object中的一个方法，用户对象回收前进行调用。
 */
public class T_System {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int x = 0; x < 2222; x++) {
            str += x;
        }
        long end = System.currentTimeMillis();
        System.out.println("话费时间：" + (end - start));

        System.gc();
        // Runtime.getRuntime().gc();

        //如果你不能忘记心中的委屈，不能忍辱负重上路，想想你未完成的伟大抱负，你不值得
        Ren ren = new Ren();
        ren = null;
        System.gc();
    }

    static class Ren {

        public Ren() {
            System.out.println("出世");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("我被虚拟机回收了");
            throw new Exception("我还要再活500年");
        }
    }


}
