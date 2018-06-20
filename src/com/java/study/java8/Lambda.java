package com.java.study.java8;

/**
 * Crete by Marlon
 * Create Date: 2017/11/9
 * Class Describe java8 ������
 * ����ʽ��� �� ��������������ڵ���������Ӫ
 * 1.����俪��
 * 2.��������̵��ص㣺 �ṹ����ʮ������
 * 3.����ʽ��� ʹ�� ����ӿھ�������һ���ӿ�
 * <p>
 **/

public class Lambda {

    //����ӿڹ淶 ֻ��������һ������

    @FunctionalInterface
    interface Imessage {
        public void print();
    }

    @FunctionalInterface
    interface IMath {
        public int add(int x, int y);
    }

    public static void main(String[] args) {
        //ԭʼд��
        Imessage imessage = new Imessage() {
            @Override
            public void print() {
                System.out.println("��ͨ��������");
            }
        };
        imessage.print();

        /**
         * �������
         * (����) -> ִ�з�����
         */

        /**
         *�������
         * ����) -> {
         *    // ִ������
         * };
         */
        Imessage msg = () -> System.out.println("Hello java8  world ");
        msg.print();

        /**
         * ���Բ���return ���
         */
        IMath math = (p1, p2) -> p1 + p2;
        System.out.println(math.add(10, 20) + "");
    }




}
