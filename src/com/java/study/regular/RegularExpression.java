package com.java.study.regular;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Crete by Marlon
 * Create Date: 2018/2/28
 * Class Describe ������ʽ
 * ����ƥ�����  ����������˽�
 * �򵥵Ĵ������������������������в����ġ�
 * <p>
 * ������ʽ�� linux  Perl����
 * java 1.4  java.util.regex ���򿪷���
 * <p>
 * ԭ����ɢ��ѧ
 * ����ͳ��
 **/
public class RegularExpression {


    public static void main(String[] args) {
        //�ж�һ���ַ����Ƿ����������

        //��ͳ��У�鷽ʽ
        System.out.println(isNumber("abc"));
        System.out.println(isNumber("12312312"));


        //������������ַ�����У��  �ַ�����У��ǳ���
        System.out.println("abc".matches("\\d+"));
        System.out.println("12312312".matches("\\d+"));

        //�ص�  java.util.regex  Pattern ƥ��ķ�ʽ


        //String ��������֧��
        String str = "asdfasdf9023iofj,;'[[][o9023jfs@%@#$#$*(*djlasd90903jsdfklaslaol";
        String regex = "[^a-zA-Z]";
        //����߲�����  �����ַ��Ķ��ɵ�
        System.out.println(str.replaceAll(regex, ""));

        //�ַ������
//        String str1 = "sdfjas234234lkfjasklfjasl234234fkasjfdewiozio234234vuioioe";
//        String regex2 = "\\d+";
//        String[] result = str1.split(regex2);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }

        //�ַ�����֤  ��֤ĳһ���ַ����Ƿ�������(������С��)
        String str3 = "439894894";
        String regex3 = "\\d+(\\.\\d+)"; //[0-9]
        if (str3.matches(regex3)) {
            double data = Double.parseDouble(str3);
            System.out.println(data);
        } else {
            System.out.println("����һ������");
        }

        //�ж�һ���ַ��� �Ƿ�Ϊ���ڻ�ʱ��  �������ת��ΪDate����
        String str4 = "2019-10-13 10:12:23"; //
        String regex4 = "\\d{4}-\\d{2}-\\d{2}";
        if (str4.matches(regex4)) {
            try {
                System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(str4));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (str4.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")) {
            try {
                System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(str4));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("ʱ���ʽ����");
        }

        //�жϸ����ĵ绰�����Ƿ���ȷ  �����ָ�ʽ�����ж�
        String phone = "2161280";
        String phone1 = "05312161280";
        String phone2 = "(2342)-2161280";

        System.out.println(phone.matches("\\d{7,8}"));
        System.out.println(phone1.matches("(\\d{3,4})?\\d{7,8}"));
        System.out.println(phone2.matches("( (\\(\\d{3,4} \\) -) | (\\d{3,4}))?\\d{7,8}"));


    }


    public static boolean isNumber(String str) {
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i] > '9' || data[i] < '0') {
                return false;
            }
        }
        return true;
    }

}
