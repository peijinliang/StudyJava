package com.java.study;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe  ��Ҫ�����ڲ�����ⲿ���ʹ��
 * �����ⲿ�ඨ��ĳ�Ա������**Outter.this.data
 * �����ڲ��ඨ��ĳ�Ա������**this.data
 **/

public class Outter {

    //�ⲿ��ĳ�Ա����
    private String data = "�ⲿ����";

    private class Inner {

        private String data = "�ڲ�����";

        public void innerPrint() {
            System.out.println(Outter.this.data);
            System.out.println(this.data);
        }

    }

    public void outterPrint() {
        Inner i = new Inner();
        i.innerPrint();
    }

}
