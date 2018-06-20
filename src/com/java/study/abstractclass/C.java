package com.java.study.abstractclass;


/**
 * Crete by Marlon
 * Create Date: 2018/3/20
 * Class Describe
 * 抽象类前边不许加 static 关键字
 **/

public abstract class C {
    public abstract void printC();

    //static  为外部抽象类
    //否则就是内部抽象类

    static abstract class B {
        public abstract void printB();
    }

}
