package com.java.study.reflect.vo;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Crete by Marlon
 * Create Date: 2018/3/3
 * Class Describe  ����Ĺ����ǽ��ַ��������ݸ������Զ�Ӧ�����ͱ�Ϊ������������
 * Type �� int��Integer�� double (Double) long(Long) String Date
 * Date: ����ͬʱ֧������ʱ�䣨yyyy-MM-dd HH:mm:ss����ʱ�䣨yyyy-MM-dd��
 **/
public class ObjectValueUtils {


    /**
     * ���𽫴�����ַ��� ��Ϊ��ָ���������ͷ��ϵ���������
     *
     * @param wrapObject Ҫ�����Ķ���
     * @param attribute  ��������
     * @param value      ��������ݣ������ַ�����
     * @return �������Ե����ͽ���ת�Ͳ���
     */
    public static Object getValue(Object wrapObject, String attribute, String value) throws NoSuchFieldException {
        Field field = ObjectUtils.getObjectField(wrapObject, attribute);
        if (field == null) {
            return null;
        }
        return stringToType(field.getType().getSimpleName(), value);
    }


    /**
     * ����ָ�������ͽ��ַ�������ת�ʹ���
     *
     * @param type  ��������
     * @param value ��������
     * @return ת��Ϊ��������
     */
    public static Object stringToType(String type, String value) {
        if ("String".equals(type)) {  //�ַ�������
            if (isNotEmpty(value)) {
                return value;
            } else {
                return null;
            }
        } else if ("int".equals(type) || "Integer".equals(type)) { //����
            if (isInt(value)) {
                return Integer.parseInt(value);
            }
        } else if ("double".equals(type) || "Double".equals(type)) { //����
            if (isDouble(value)) {
                return Double.parseDouble(value);
            }
        } else if ("long".equals(type) || "Long".equals(type)) {
            if (isInt(value)) {
                return Long.parseLong(value);
            }
        } else if ("Date".equals(type)) {
            String pattern = null;
            if (isDate(value)) {  //��������
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
     * �жϸ����ַ����Ƿ������ڣ�yyyy-MM-dd��
     *
     * @param str �������ַ���
     * @return
     */
    private static boolean isDate(String str) {
        if (isNotEmpty(str)) {
            return str.matches("\\d{4}-\\d{2}-\\d{2}");
        }
        return false;
    }

    /**
     * �жϸ����ַ����Ƿ�������ʱ�����ͣ�yyyy-MM-dd hh:mm:ss��
     *
     * @param str �������ַ���
     * @return
     */
    private static boolean isDateTime(String str) {
        if (isNotEmpty(str)) {
            return str.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        }
        return false;
    }


    /**
     * �жϸ������ַ����Ƿ���С��
     *
     * @param str �������ַ���
     * @return �ַ�����С����� (11�� 11.0)����true ,���򷵻�false
     */
    private static boolean isDouble(String str) {
        if (isNotEmpty(str)) {
            return str.matches("\\d+(\\.\\d+)");
        }
        return false;

    }


    /**
     * �жϸ������ַ����Ƿ���һ������
     *
     * @param str �����ַ���
     * @return ����ַ���������������ɵģ��ͷ���true�����򷵻�false
     */
    private static boolean isInt(String str) {
        if (isNotEmpty(str)) {   //���뱣֤������ַ���������
            if (str.matches("\\d+")) ;
        }
        return false;
    }


    /**
     * �ж��ַ����Ƿ��ǿ��ַ��� �ſ��Խ��д������
     *
     * @param str Ҫ�жϵ��ַ���
     * @return ����ַ���Ϊ�գ���ô����false�����򷵻�true
     */
    private static boolean isNotEmpty(String str) {
        return !(str == null || str.isEmpty() || "".equals(str));
    }


}
