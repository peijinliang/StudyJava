package com.java.study;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe java 国际化
 * 通过不同的资源文件进行读取
 * 
 **/
public class Internationalization {

    public static void main(String[] args) {
        Locale.ENGLISH.toString();
        Locale.CHINA.toString();

        //包.文件名  没有后缀  默认在Src文件下
        ResourceBundle res = ResourceBundle.getBundle("language.Message");
//      System.out.println(res.getString("hello"));
        System.out.println(res.getString("welcome"));

        Locale zh = new Locale("zh", "CN");
        ResourceBundle zhres = ResourceBundle.getBundle("language.Message", zh);
        System.out.println("中文环境:" + zhres.getString("welcome"));

        Locale en = new Locale("en", "US");
        ResourceBundle enres = ResourceBundle.getBundle("language.Message", en);
        System.out.println("中文环境:" + enres.getString("welcome"));

        //占位符等方式进行操作
        System.out.println(MessageFormat.format(zhres.getString("message"),"张三","赵四","王五"));

        System.out.println(MessageFormat.format(enres.getString("message"),"ZHANG SAN","ZHAO SI","WANGWU"));

        System.out.println(MessageFormat.format(res.getString("message"),"小魔仙","大魔仙","呵呵哒"));

    }


}
