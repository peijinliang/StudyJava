package com.java.study.util;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 * String �÷��ͽ���
 * �ڴ�����ʹ��
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

        StringBuffer sb = new StringBuffer("[");//����StringBuffer����
        sb.append("hehe");//��hehe�����ַ�������� "[hehe"
        sb.append("]");//append();�������������������ڸ�sb��ֵ��
        System.out.println(sb);
        String str = sb.toString();//��"[hehe]"����ֵ��һ���ַ�������str
        str.equals("sdffsd");

//        sb.compareTo("sdfsdf");

//        StringBuilder sb=new StringBuilder("[");//����StringBuilder����
//        sb.append("hehe");//��hehe�����ַ�������� "[hehe"
//
//        sb.append("]");//append();�������������������ڸ�sb��ֵ��
//        System.out.println(sb);

    }


}
