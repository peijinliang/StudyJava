package com.java.study.Jarray;

/**
 * Crete by Marlon
 * Create Date: 2018/2/2
 * Class Describe
 **/

//�����ר�ŵ����������
public class Arrary {

    private int data[];  //����һ���������飬��С���ⲿ����

    public Arrary(int len) {//�����ʹ��Array��ͱ�������Array��Ĵ�С
        if (len > 0) {     //len ����0  һ�������������С
            this.data = new int[len];
        } else {
            this.data = new int[1];   //����һ���ռ�
        }
    }


}
