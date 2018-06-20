package com.java.study.abstractclass;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class B extends A {

    private int num = 100;

    public B(int num) {
        super();  //����A�Ĺ��췽��
        this.num = num;
    }

    //������ print ����ʱ num��δ�����ڴ�ռ�
    @Override
    void print() {
        System.out.println("num: " + this.num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
