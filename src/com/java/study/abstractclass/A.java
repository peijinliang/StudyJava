package com.java.study.abstractclass;

/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 * final 类不能拥有子类
 * 抽象方法不能使用privte进行修饰，因为抽象类需要被子类继承
 **/
public abstract class A {

    public A() {
        this.print();
    }

    abstract void print();

}
