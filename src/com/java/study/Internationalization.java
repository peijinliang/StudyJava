package com.java.study;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe java ���ʻ�
 * ͨ����ͬ����Դ�ļ����ж�ȡ
 **/

public class Internationalization {

    public static void main(String[] args) {
        Locale.ENGLISH.toString();
        Locale.CHINA.toString();

        ResourceBundle res = ResourceBundle.getBundle("language.Message");
//      System.out.println(res.getString("hello"));
        System.out.println(res.getString("welcome"));





    }


}
