package com.java.study.reflect.vo;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * ��Ҫ�Ƕ�������һЩ�ַ����Ĳ����ʹ���
 **/

public class StringUtils {

    private StringUtils() {

    }

    /**
     * ����ĸ��д�����
     *
     * @param str
     * @return
     */
    public static String initcap(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
