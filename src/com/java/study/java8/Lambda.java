package com.java.study.java8;

/**
 * Crete by Marlon
 * Create Date: 2017/11/9
 * Class Describe java8 新特性
 * 函数式编程 和 面向对象编程是现在的两大编程阵营
 * 1.简化语句开发
 * 2.面向对象编程的特点： 结构必须十分完整
 * 3.函数式编程 使用 必须接口就允许定义一个接口
 * <p>
 **/

public class Lambda {

    //定义接口规范 只能允许有一个方法

    @FunctionalInterface
    interface Imessage {
        public void print();
    }

    @FunctionalInterface
    interface IMath {
        public int add(int x, int y);
    }

    public static void main(String[] args) {
        //原始写法
        Imessage imessage = new Imessage() {
            @Override
            public void print() {
                System.out.println("普通方法调用");
            }
        };
        imessage.print();

        /**
         * 单行语句
         * (参数) -> 执行方法；
         */

        /**
         *多行语句
         * 参数) -> {
         *    // 执行内容
         * };
         */
        Imessage msg = () -> System.out.println("Hello java8  world ");
        msg.print();

        /**
         * 可以不用return 语句
         */
        IMath math = (p1, p2) -> p1 + p2;
        System.out.println(math.add(10, 20) + "");
    }




}
