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
     * �������ǵĶ����ƶ����������� ȡ��Field ������Ϣ
     *
     * @param wrapObject ��ǰ��������
     * @param attribute  ����
     * @return ���ԵĶ�����������Բ����ڷ���null
     */
    public static Field getObjectField(Object wrapObject, String attribute) throws NoSuchFieldException {
        Field field = wrapObject.getClass().getDeclaredField(attribute);  //ȡ��������
        if (field == null) {    //����ڶ���ȡ�û��� ��һĳһЩ������Ҫ����ȡ��
            field = wrapObject.getClass().getField(attribute);     //ȡ�ø�������
        }
        return field;
    }


    /**
     * �������ָ�����е�Geter����
     *
     * @param wrapObject ��ʾҪ���÷��������������
     * @param attribute  ��ʾ��������
     * @return ���ö���Ľ��
     */
    public static Object getObject(Object wrapObject, String attribute) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException {
        String methodName = "get" + StringUtils.initcap(attribute);
        //����ָ����Field ����Ŀ����ȡ�ö������ͣ����û�д�����Ҳ��û�н������Ĳ�����
        Field field = getObjectField(wrapObject, attribute);
        if (field == null) {    //���β��������޷�ȡ�ö�Ӧ�ĳ�Ա����
            return null; //������һ��������
        }
        Method method = wrapObject.getClass().getMethod(methodName);
        Object object = method.invoke(wrapObject);  //ȥִ�в���
        if (object == null) {
            //���еĳ����඼����ͨ��������ʵ�ֶ����ʵ����������Ҳ����˵ֻ��Ҫȡ����Ķ������;Ϳ���ʵ�ָù�����
            object = field.getType().newInstance();  //ʵ��������
            setObjectValue(wrapObject, attribute, object);
        }
        return object;
    }


    /**
     * ����ָ�������������ָ��������� ����Setter����
     *
     * @param wrapObject �������ڵ�ʵ��������
     * @param attribute  ��������
     * @param value      ��������
     */
    public static void setObjectValue(Object wrapObject, String attribute, Object value) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //����ָ����Field ����Ŀ����ȡ�ö������ͣ����û�д�����Ҳ��û�н������Ĳ�����
        Field field = getObjectField(wrapObject, attribute);

        if (field == null) {    //���β��������޷�ȡ�ö�Ӧ�ĳ�Ա����
            return; //������һ��������
        }
        String methodName = "set" + StringUtils.initcap(attribute);
        Method method = wrapObject.getClass().getMethod(methodName, field.getType());
        method.invoke(wrapObject, value);
    }


}
