package com.java.study.java8;

import com.java.study.bean.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.*;

/**
 * Crete by Marlon
 * Create Date: 11/27/2017
 * Class Describe Lambda ���ʽ
 * <p>
 * 1.�൱�������ڲ����Ч��
 * 2.�հ�
 * 3.��������
 **/

public class LambdaExpression {


    public static void main(String args[]) {
        testdescrStyle();
    }

    /**
     * java ����ʽ��̵ļ�����ʽ
     */
    public static void testdescrStyle() {
        //�����ű�ʾû���κβ���
        Runnable noArguments = () -> System.out.println("Hello World");
        //��������һ������������ʡȴ����
        ActionListener oneArgument = (event) -> System.out.println("button clicked");
        //���������{}���������Ĵ����
        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" World");
        };
        //��ʾ�����ж������
        BinaryOperator<Long> add = (x, y) -> x + y;
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
    }


    /**
     * �հ�
     * ���轫��������Ϊ final
     */
    public static void testclosure() {
        Button button = new Button();
        final String name = "what's your name?";
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("hi " + name);
            }
        });
        String names = "what's your name?";
        ActionListener actionListener = (event) -> {
            System.out.println("hi " + names);
        };
    }


    /**
     * �������õ�Ψһ��;��֧��Lambda�ļ�д
     * ����������һ�����ӽ��գ��׶���Lambda���ʽ��ע�ⷽ��������һ��Lambda���ʽ�����з������õĲ�������˫ð��
     * �������õķ���:
     */
    /**
     * ���þ�̬����
     * �����ض������ʵ������
     * �����ض����͵���������ʵ������
     * ���ù��캯��
     */

    public static void methodReference() {

        Supplier<User> c1 = User::new;
        User s1 = c1.get();

        Function<String, Integer> stringToInteger = Integer::parseInt;

        Function<Integer, User> c2 = i -> new User(i);
        User s3 = c2.apply(100);

    }


}
