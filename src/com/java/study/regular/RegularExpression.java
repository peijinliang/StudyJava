package com.java.study.regular;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Crete by Marlon
 * Create Date: 2018/2/28
 * Class Describe 正则表达式
 * 符号匹配操作  更加深入的了解
 * 简单的代码生成器就是用正则来进行操作的。
 * <p>
 * 正则表达式： linux  Perl语言
 * java 1.4  java.util.regex 正则开发包
 * <p>
 * 原理：离散数学
 * 概率统计
 **/
public class RegularExpression {


    public static void main(String[] args) {
        //判断一个字符串是否都由数字组成

        //传统的校验方式
        System.out.println(isNumber("abc"));
        System.out.println(isNumber("12312312"));


        //采用正则进行字符串的校验  字符串的校验非常简单
        System.out.println("abc".matches("\\d+"));
        System.out.println("12312312".matches("\\d+"));

        //重点  java.util.regex  Pattern 匹配的方式


        //String 类对正则的支持
        String str = "asdfasdf9023iofj,;'[[][o9023jfs@%@#$#$*(*djlasd90903jsdfklaslaol";
        String regex = "[^a-zA-Z]";
        //从里边拆数据  将非字符的都干掉
        System.out.println(str.replaceAll(regex, ""));

        //字符串拆分
//        String str1 = "sdfjas234234lkfjasklfjasl234234fkasjfdewiozio234234vuioioe";
//        String regex2 = "\\d+";
//        String[] result = str1.split(regex2);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }

        //字符串验证  验证某一个字符串是否是数字(整数和小数)
        String str3 = "439894894";
        String regex3 = "\\d+(\\.\\d+)"; //[0-9]
        if (str3.matches(regex3)) {
            double data = Double.parseDouble(str3);
            System.out.println(data);
        } else {
            System.out.println("不是一个数字");
        }

        //判断一个字符串 是否为日期或时间  如果是则转化为Date类型
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
            System.out.println("时间格式错误");
        }

        //判断给定的电话号码是否正确  有三种格式进行判断
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
