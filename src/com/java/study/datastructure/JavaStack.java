package com.java.study.datastructure;

import java.util.Stack;

/**
 * Crete by Marlon
 * Create Date: 2018/2/27
 * Class Describe
 * ��һ���Ƚ���������ݸ�ʽ���������������ҳ���ˡ�
 * ����Ϊ�� Vector
 * ��Ҫ��������ת��
 * <p>
 * ��ջ  push
 * ��ջ  pop
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
        System.out.println(stacks.pop()); //��ջ�쳣 JavaStack.java:31

        //����JVM
        stacks.push("");

    }


}
