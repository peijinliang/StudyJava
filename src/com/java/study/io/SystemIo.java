package com.java.study.io;

import java.io.*;

/**
 * Crete by Marlon
 * Create Date: 2018/3/14
 * Class Describe
 **/

public class SystemIo {

    public static void main(String[] args) throws IOException {
 //        System.out.println();
//        System.err.println();
//        OutputStream out = System.out; //����ʵ������ת��
//        out.write("�����ƽ".getBytes());
//        out.close();


        InputStream input = System.in;  //ʵ����
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        StringBuffer stringBuffer = new StringBuffer();

        System.out.print("�����룺");
        byte[] data = new byte[100];

        int temp = 0;

        //���в����ڸ�1
//        while ((temp = input.read(data)) != -1) {   //
        //�û��Լ����л��д�����Ϊ���в��������ļ�����
//            bos.write(data, 0, temp); //�������ڴ������
//            if (temp < data.length) {
//                break;
//            }
//            System.out.println("*****************��" + temp);
//        }
//        System.out.println("���������Ϊ��" + new String(bos.toByteArray()));

        while ((temp = input.read()) != -1) {
            if ('\n' == temp) {
                break;
            }
            stringBuffer.append((char) temp);
        }

        System.out.print("���������Ϊ:" + stringBuffer);
        bos.close();
        input.close();
    }


}
