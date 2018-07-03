package com.java.study.factory;


/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe
 * <p>
 * ������ʵ�ֹ�����
 **/

public class Factory {

    private Factory() {

    }

    public static <T> T getInstances(String className) {
        T obj = null;
        try {
            obj = (T) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    
}
