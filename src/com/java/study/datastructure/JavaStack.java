package com.java.study.datastructure;

import java.util.Stack;

/**
 * Crete by Marlon
 * Create Date: 2018/2/27
 * Class Describe
 * 是一种先进后出的数据格式，像是浏览器的网页后退。
 * 父类为： Vector
 * 不要进行向上转型
 * <p>
 * 入栈  push
 * 出栈  pop
 **/

public class JavaStack {

    public static void main(String[] args) {
        Stack<String> stacks = new Stack<>();

        stacks.push("1");
        stacks.push("2");
        stacks.push("3");
        stacks.push("4");

        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop()); //出栈异常 JavaStack.java:31

        //深入JVM
        stacks.push("");

    }


}
