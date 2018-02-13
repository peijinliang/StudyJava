package com.java.study.keyclass;

import com.java.study.io.CharacterStream;

/**
 * String Buffer ��ѧϰ
 * String : ��������һ���������ɸı䣬����ı� �������õ� ָ����ѡ�
 * String ���ɸ��ĵ�ȱ������ԡ�
 * StringBuffer Ƶ���޸Ĳ��Һܶ��
 * <p>
 * public interface CharSequence
 * �ַ������ַ�����
 * �����⣺
 * String ��StringBuffer��StringBuilder������
 * String ���ݲ����޸� StringBuffer���ݿ��޸�
 * StringBuffer����ͬ�����������̰߳�ȫ��������StringBuilder �����첽���������̲߳���ȫ������
 * String > StringBuffer > StringBuilder������
 * StringBuffer �߶˿���
 */

public class T_StringBuffer {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(" i ").append(" am ").append(" hero ");
        fun(buffer);
        System.out.println(buffer.toString());

        CharSequence seq = "Hello"; // �������Ϊ����ӿڽ���ʵ����
        //String��StringBuffer �໥ת��
        String hello = "HelloWorld";
        StringBuffer buf = new StringBuffer(hello);

        System.out.println(buf.toString());
        buf.reverse(); // �ַ�����ת
        System.out.println("StringBuffer���з������ַ���ת��" + buf.toString());

        System.out.println("StringBuffer���з�����ɾ��ָ����Χ���ݣ�" + buf.delete(1,3).insert(4,"����").toString());
    }

    public static void fun(StringBuffer temp) {
        temp.append("\n").append(" �������� ");
    }

}
