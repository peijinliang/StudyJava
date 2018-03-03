package com.java.study.reflect.vo;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * 主要是对他进行一些字符串的操作和处理
 **/

public class StringUtils {

    private StringUtils() {

    }

    /**
     * 首字母大写的情况
     *
     * @param str
     * @return
     */
    public static String initcap(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
