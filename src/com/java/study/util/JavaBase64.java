package com.java.study.util;

import java.util.Base64;

/**
 * Crete by Marlon
 * Create Date: 2018/2/26
 * Class Describe  ���ܺͽ���
 * ����ѧ  �����ԭ��
 **/

public class JavaBase64 {


    public static void main(String[] args) {
        String msg = "www.360zebra.com";
        String eMsg = Base64.getEncoder().encodeToString(msg.getBytes());
        System.out.println("���ܺ����Ϣ��" + eMsg);
        byte[] data = Base64.getDecoder().decode(eMsg);
        System.out.println("���ܺ����Ϣ��" + new String(data));

        //    "��������" +"����Կ"  Base64ת��     MD5
        //ֻʹ��һ�μ��ܵ���û�м���
    }

    //��μ���
    public static String encode(String msg) {
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }

    
}
