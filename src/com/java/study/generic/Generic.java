package com.java.study.generic;


/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe ������
 **/

public class Generic<T> {

    //key�����Ա����������ΪT,T���������ⲿָ��

    private T key;


    public Generic(T key) { //���͹��췽���β�key������ҲΪT��T���������ⲿָ��
        this.key = key;
    }


    public T getKey() { //���ͷ���getKey�ķ���ֵ����ΪT��T���������ⲿָ��
        return key;
    }


}
