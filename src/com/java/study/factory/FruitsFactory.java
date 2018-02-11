package com.java.study.factory;


/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe  �����һ���򵥵Ĺ�����
 * ������ʵ���и����������õ� :  ԭ����Factory����ô�����Ļ�ȡ����ȡ������Ϊֹ
 * ��Ҫͨ�����������ʵ�� ��
 * <p>
 * ͨ������ģʽ �Ľ��� �������ģʽ ���Զ�̬�ļ�����
 * �����ϵ����� ��
 **/

public class FruitsFactory {


    private FruitsFactory() {

    }

    public static Fruits getInstances(String className) {
        //��һ��д��
//        if (className.equals("apple")) {
//            return new Apple();
//        } else if ("orange".equals(className)) {
//            return new Orange();
//        } else {
//            return null;
//        }

        //�ڶ���д��  ȱ�������� ��ȡ����̫��һ��
        Fruits fruits = null;
        try {
            fruits = (Fruits) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return fruits;
    }





}
