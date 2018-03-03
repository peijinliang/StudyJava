package com.java.study.reflect.vo;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * �����������Ƶ��� ��Ӧ���getter ��setter����
 **/
public class ObjectUtils {

    private ObjectUtils() {

    }

    /**
     * �������ָ�����е�Geter����
     *
     * @param wrapObject ��ʾҪ���÷��������������
     * @param attribute  ��ʾ��������
     * @return ���ö���Ľ��
     */
    public static Object getObject(Object wrapObject, String attribute) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        String methodName = "get" + StringUtils.initcap(attribute);
        Method method = null;
        //����ָ����Field ����Ŀ����ȡ�ö������ͣ����û�д�����Ҳ��û�н������Ĳ�����
        Field field = wrapObject.getClass().getDeclaredField(attribute);  //ȡ��������
        if (field == null) {    //����ڶ���ȡ�û��� ��һĳһЩ������Ҫ����ȡ��
            field = wrapObject.getClass().getField(attribute);     //ȡ�ø�������
        }
        if (field == null) {    //���β��������޷�ȡ�ö�Ӧ�ĳ�Ա����
            return null; //������һ��������
        }
        method = wrapObject.getClass().getMethod(methodName);
        return method.invoke(wrapObject);  //ȥִ�в���
    }


    /**
     * ����ָ�������������ָ��������� ����Setter����
     * @param wrapObject �������ڵ�ʵ��������
     * @param attribute  ��������
     * @param value      ��������
     */
    public static void setObjectValue(Object wrapObject, String attribute, String value) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //����ָ����Field ����Ŀ����ȡ�ö������ͣ����û�д�����Ҳ��û�н������Ĳ�����
        Field field = wrapObject.getClass().getDeclaredField(attribute);  //ȡ��������
        if (field == null) {    //����ڶ���ȡ�û��� ��һĳһЩ������Ҫ����ȡ��
            field = wrapObject.getClass().getField(attribute);     //ȡ�ø�������
        }
        if (field == null) {    //���β��������޷�ȡ�ö�Ӧ�ĳ�Ա����
            return; //������һ��������
        }
        String methodName = "set" + StringUtils.initcap(attribute);
        Method method = wrapObject.getClass().getMethod(methodName, field.getType());
        method.invoke(wrapObject, value);
    }


}
