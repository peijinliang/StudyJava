package com.java.study;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe java ���ʻ�
 * ͨ����ͬ����Դ�ļ����ж�ȡ
 * 
 **/
public class Internationalization {

    public static void main(String[] args) {
        Locale.ENGLISH.toString();
        Locale.CHINA.toString();

        //��.�ļ���  û�к�׺  Ĭ����Src�ļ���
        ResourceBundle res = ResourceBundle.getBundle("language.Message");
//      System.out.println(res.getString("hello"));
        System.out.println(res.getString("welcome"));

        Locale zh = new Locale("zh", "CN");
        ResourceBundle zhres = ResourceBundle.getBundle("language.Message", zh);
        System.out.println("���Ļ���:" + zhres.getString("welcome"));

        Locale en = new Locale("en", "US");
        ResourceBundle enres = ResourceBundle.getBundle("language.Message", en);
        System.out.println("���Ļ���:" + enres.getString("welcome"));

        //ռλ���ȷ�ʽ���в���
        System.out.println(MessageFormat.format(zhres.getString("message"),"����","����","����"));

        System.out.println(MessageFormat.format(enres.getString("message"),"ZHANG SAN","ZHAO SI","WANGWU"));

        System.out.println(MessageFormat.format(res.getString("message"),"Сħ��","��ħ��","�Ǻ���"));

    }


}
