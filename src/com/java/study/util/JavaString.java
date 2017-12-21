package com.java.study.util;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 * String 用法和介绍
 * 内存分配的使用
 **/
public class JavaString {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";

        if (str1 == str2) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 != str2");
        }

        String str3 = "abc";
        if (str2 == str3) {
            System.out.println("str2 == str3");
        } else {
            System.out.println("str2 != str3");
        }

        StringBuffer sb = new StringBuffer("[");//创建StringBuffer对象
        sb.append("hehe");//把hehe加入字符串，变成 "[hehe"
        sb.append("]");//append();不会制造垃圾，真正在改sb的值；
        System.out.println(sb);
        String str = sb.toString();//把"[hehe]"，赋值给一个字符串对象str
        str.equals("sdffsd");

//        sb.compareTo("sdfsdf");

//        StringBuilder sb=new StringBuilder("[");//创建StringBuilder对象
//        sb.append("hehe");//把hehe加入字符串，变成 "[hehe"
//
//        sb.append("]");//append();不会制造垃圾，真正在改sb的值；
//        System.out.println(sb);

    }


}
