package com.java.study;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe  主要讲述内部类和外部类的使用
 * 访问外部类定义的成员变量：**Outter.this.data
 * 访问内部类定义的成员变量：**this.data
 **/

public class Outter {

    //外部类的成员变量
    private String data = "外部数据";

    private class Inner {

        private String data = "内部数据";

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
