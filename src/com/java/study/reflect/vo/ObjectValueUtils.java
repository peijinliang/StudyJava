package com.java.study.reflect.vo;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Crete by Marlon
 * Create Date: 2018/3/3
 * Class Describe  本类的功能是将字符串的内容根据属性对应的类型变为各种数据类型
 * Type ： int（Integer） double (Double) long(Long) String Date
 * Date: 必须同时支持日期时间（yyyy-MM-dd HH:mm:ss）、时间（yyyy-MM-dd）
 **/
public class ObjectValueUtils {


    /**
     * 负责将传入的字符串 变为与指定属性类型符合的数据类型
     *
     * @param wrapObject 要操作的对象
     * @param attribute  属性类型
     * @param value      传入的数据（都是字符串）
     * @return 根据属性的类型进行转型操作
     */
    public static Object getValue(Object wrapObject, String attribute, String value) throws NoSuchFieldException {
        Field field = ObjectUtils.getObjectField(wrapObject, attribute);
        if (field == null) {
            return null;
        }
        return stringToType(field.getType().getSimpleName(), value);
    }


    /**
     * 根据指定的类型将字符串进行转型处理
     *
     * @param type  数据类型
     * @param value 数据内容
     * @return 转换为具体类型
     */
    public static Object stringToType(String type, String value) {
        if ("String".equals(type)) {  //字符串类型
            if (isNotEmpty(value)) {
                return value;
            } else {
                return null;
            }
        } else if ("int".equals(type) || "Integer".equals(type)) { //整数
            if (isInt(value)) {
                return Integer.parseInt(value);
            }
        } else if ("double".equals(type) || "Double".equals(type)) { //整数
            if (isDouble(value)) {
                return Double.parseDouble(value);
            }
        } else if ("long".equals(type) || "Long".equals(type)) {
            if (isInt(value)) {
                return Long.parseLong(value);
            }
        } else if ("Date".equals(type)) {
            String pattern = null;
            if (isDate(value)) {  //日期类型
                pattern = "yyyy-MM-dd";
            } else if (isDateTime(value)) {
                pattern = "yyyy-MM-dd hh:mm:ss";
            }
            if (pattern != null) {
                try {
                    return new SimpleDateFormat(pattern).parse(value);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else {
                return null;
            }
        }
        return null;
    }


    /**
     * 判断给定字符串是否是日期（yyyy-MM-dd）
     *
     * @param str 给定的字符串
     * @return
     */
    private static boolean isDate(String str) {
        if (isNotEmpty(str)) {
            return str.matches("\\d{4}-\\d{2}-\\d{2}");
        }
        return false;
    }

    /**
     * 判断给定字符串是否是日期时间类型（yyyy-MM-dd hh:mm:ss）
     *
     * @param str 给定的字符串
     * @return
     */
    private static boolean isDateTime(String str) {
        if (isNotEmpty(str)) {
            return str.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        }
        return false;
    }


    /**
     * 判断给定的字符串是否是小数
     *
     * @param str 给定的字符串
     * @return 字符串由小数组成 (11和 11.0)返回true ,否则返回false
     */
    private static boolean isDouble(String str) {
        if (isNotEmpty(str)) {
            return str.matches("\\d+(\\.\\d+)");
        }
        return false;

    }


    /**
     * 判断给定的字符串是否是一个整数
     *
     * @param str 给定字符串
     * @return 如果字符串是由整数锁组成的，就返回true，否则返回false
     */
    private static boolean isInt(String str) {
        if (isNotEmpty(str)) {   //必须保证传入的字符串有内容
            if (str.matches("\\d+")) ;
        }
        return false;
    }


    /**
     * 判断字符串是否不是空字符串 才可以进行处理操作
     *
     * @param str 要判断的字符串
     * @return 如果字符串为空，那么返回false，否则返回true
     */
    private static boolean isNotEmpty(String str) {
        return !(str == null || str.isEmpty() || "".equals(str));
    }


}
