package com.java.study.Jarray;

/**
 * Crete by Marlon
 * Create Date: 2018/2/2
 * Class Describe
 **/

/**
 * �����ר�ŵ����������
 */
public class Arrary {

    //����һ���������飬��С���ⲿ����
    private int data[];

    public Arrary(int len) {
        //len ����0  һ�������������С
        if (len > 0) {
            //�����ʹ��Array��ͱ�������Array��Ĵ�С
            this.data = new int[len];
        } else {
            //����һ���ռ�
            this.data = new int[1];
        }
    }

}
