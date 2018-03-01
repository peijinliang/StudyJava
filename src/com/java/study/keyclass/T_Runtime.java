package com.java.study.keyclass;

/**
 * Java Runtime��ѧϰ
 * �۲������ڴ�Ĳ������
 * freeMemory()  ��ǰ�����ڴ�ռ��С
 * totalMemory() ��ǰ����ʹ���ڴ��ܿռ��С
 * maxMemory()  ����ڴ���ÿռ��С
 * <p>
 * ��Ϊ��Ҫ�ķ������ǣ�gc() �������ջ��� ���ն���
 * ʲô��GC :
 * Garbage Collector: �����ռ���
 * ���ִ���ʽ�����ֹ����ã�
 * 1���Զ������ڽ��е��á�
 * 2��runtime.gc();
 */

public class T_Runtime {

    public static void main(String[] args) {
//        Runtime runtime = new Runtime();  ���췽����˽�л�

        //�������ģʽ
        Runtime runtime = Runtime.getRuntime();


        System.out.println("1.MAX = " + byteTom(runtime.maxMemory()));
        System.out.println("1.TOTAL = " + byteTom(runtime.totalMemory()));
        System.out.println("1.FREE = " + byteTom(runtime.freeMemory()));
        System.out.println("���г���------------------------");
        String str = "";

        for (int i = 0; i < 99999; i++) {
            str += i;
        }

        System.out.println("2.MAX = " + byteTom(runtime.maxMemory()));
        System.out.println("2.TOTAL = " + byteTom(runtime.totalMemory()));
        System.out.println("2.FREE = " + byteTom(runtime.freeMemory()));

        runtime.gc(); //����JVM �������ջ���
        System.out.println("�����������ջ��ƣ�------------------------");
        System.out.println("3.MAX = " + byteTom(runtime.maxMemory()));
        System.out.println("3.TOTAL = " + byteTom(runtime.totalMemory()));
        System.out.println("3.FREE = " + byteTom(runtime.freeMemory()));


    }

    public static double byteTom(long num) {
        return (double) num / 1024 / 1024;
    }


}
