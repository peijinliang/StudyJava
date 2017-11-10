package com.java.study.generic;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe ���ͷ���
 *
 * ΪʲôҪʹ�÷��ͷ����أ�
 * 1.������ʵ������ʱ��Ҫָ�����ͣ�����뻻һ�����ͣ���Ҫд�ܶ�Code �Ƚ��鷳��
 * 2.ָ�����ͣ��������
 **/

public class GenericMethod {

    /**
     * ���ͷ���
     *
     * @param clazz �����������Ͷ���Class<T>,ָ������T�ľ�������
     * @param <T>   <T> �����˷���Ϊ���ͷ��������и�����T
     * @return T  ����T
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public <T> T getObject(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T object = clazz.newInstance();
        return object;
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        GenericMethod genericMethod = new GenericMethod();
        //java����
        User user = (User) genericMethod.getObject(Class.forName("com.java.study.generic.User"));
        System.out.println(user);
    }


}
