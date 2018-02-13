package com.java.study.keyclass;

import com.java.study.reflect.Person;

/**
 * java.lang.System ��ѧϰ
 * static long	currentTimeMillis()
 * Returns the current time in milliseconds.
 * <p>
 * System.gc();�������շ���
 * <p>
 * �����⣺
 * final�� finally �� finalize
 * final:���ܹ����̳еĸ��ࡢ���ܱ���д�ķ��������ܱ��޸ĵĳ���
 * finally�� ���쳣�����ͳһ����
 * finalize �� Object�е�һ���������û��������ǰ���е��á�
 */
public class T_System {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int x = 0; x < 2222; x++) {
            str += x;
        }
        long end = System.currentTimeMillis();
        System.out.println("����ʱ�䣺" + (end - start));

        System.gc();
        // Runtime.getRuntime().gc();

        //����㲻���������е�ί�����������踺����·��������δ��ɵ�ΰ�󱧸����㲻ֵ��
        Ren ren = new Ren();
        ren = null;
        System.gc();
    }

    static class Ren {

        public Ren() {
            System.out.println("����");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("�ұ������������");
            throw new Exception("�һ�Ҫ�ٻ�500��");
        }
    }


}
