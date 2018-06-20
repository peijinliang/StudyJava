package com.java.study.Jarray;

/**
 * Crete by Marlon
 * Create Date: 2018/2/2
 * Class Describe
 **/

/**
 * 定义个专门的数组操作类
 */
public class Arrary {

    //定义一个整形数组，大小由外部决定
    private int data[];

    public Arrary(int len) {
        //len 大于0  一个正常的数组大小
        if (len > 0) {
            //如果想使用Array类就必须设置Array类的大小
            this.data = new int[len];
        } else {
            //开辟一个空间
            this.data = new int[1];
        }
    }

}
