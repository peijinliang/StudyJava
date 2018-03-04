package com.java.study.reflect.vo;

import java.lang.reflect.InvocationTargetException;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * ������Ҫ����ʵ���Զ���VOƥ�䴦�������������Ҫͨ��ʵ����������ɣ����Թ��췽��˽�л�
 **/

public class BeanOperation {


    private BeanOperation() {

    }

    /**
     * ���������������ԵĲ���
     *
     * @param actionObject actionObject ��ʾ���е�ǰ������������ĳ�����ĵ�ǰ����
     * @param msg          �������Եľ������ݣ���ʽ���������ƣ���������|�������ƣ��������ݡ�
     */
    public static void setBeanValue(Object actionObject, String msg) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //������У��
        String[] rusult = msg.split("\\|");
        for (int i = 0; i < rusult.length; i++) {
            //��Ҫ���ݸ��������Ժ����ƺ����ݽ���һ�β��
            String[] temp = rusult[i].split(":",2);   //�����������ݽ��в��
            String attribute = temp[0];       //�������� ������XXXAction ���Ժ;����java�������
//           String value = temp[1];          //���ܾ�������Ժ�����
            String fields[] = attribute.split("\\.");  //���������Ϣ
            if (fields.length > 2) {    //�༶����
                Object currentObject = actionObject;   //�൱�ڵ�ǰҪ���������Զ���
                for (int y = 0; y < fields.length - 1; y++) {
                    currentObject = ObjectUtils.getObject(currentObject, fields[y]);   //geterһ��һ���ȡ��Ҫ���������Զ���
                }
                Object value = ObjectValueUtils.getValue(currentObject, fields[fields.length - 1], temp[1]);
                ObjectUtils.setObjectValue(currentObject, fields[fields.length - 1], value);
            } else {
                //��������
                Object currentObject = ObjectUtils.getObject(actionObject, fields[0]); //getEmp���� ��ȡ���� Emp����
                Object value = ObjectValueUtils.getValue(currentObject,  fields[1], temp[1]);
                //��ȡ����Emp ʵ��������   ��������setter���� ����ֵ
                ObjectUtils.setObjectValue(currentObject, fields[1], value);
            }
        }
    }

}
