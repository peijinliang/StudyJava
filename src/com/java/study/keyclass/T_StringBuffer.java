package com.java.study.keyclass;


/**
 * String Buffer 类学习
 * String : 常量内容一旦声明不可改变，如果改变 是其引用的 指向而已。
 * String 不可更改的缺点很明显。
 * StringBuffer 频繁修改并且很多次
 *
 * public interface CharSequence
 * 字符串和字符集的
 * 面试题：
 * String 、StringBuffer、StringBuilder的区别？
 * String 内容不可修改 StringBuffer内容可修改
 * StringBuffer采用同步处理，属于线程安全操作。而StringBuilder 采用异步处理，属于线程不安全操作。
 * String > StringBuffer > StringBuilder的区别
 * StringBuffer 高端开发
 *
 */

public class T_StringBuffer {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(" i ").append(" am ").append(" hero ");
        fun(buffer);
        System.out.println(buffer.toString());
        // 子类对象为父类接口进行实例化
        CharSequence seq = "Hello";
        //String和StringBuffer 相互转换
        String hello = "HelloWorld";
        StringBuffer buf = new StringBuffer(hello);

        System.out.println(buf.toString());
        buf.reverse(); // 字符串反转
        System.out.println("StringBuffer特有方法，字符反转：" + buf.toString());

        System.out.println("StringBuffer特有方法，删除指定范围数据：" + buf.delete(1, 3).insert(4, "你妹").toString());
    }

    public static void fun(StringBuffer temp) {
        temp.append("\n").append(" 无力涛涛 ");
    }

}
