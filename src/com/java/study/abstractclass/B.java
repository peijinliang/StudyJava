package com.java.study.abstractclass;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 **/
public class B extends A {

    private int num = 100;

    public B(int num) {
        super();  //这是A的构造方法
        this.num = num;
    }

    //当调用 print 方法时 num尚未开辟内存空间
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
