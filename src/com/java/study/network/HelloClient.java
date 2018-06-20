package com.java.study.network;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Crete by Marlon
 * Create Date: 2018/3/7
 * Class Describe
 **/
public class HelloClient {


    public static void main(String[] args) throws IOException {
        //1����ʾ���ӵ�ָ���������˵��������ƺͶ˿ں� localhost= 127.0.0.1
        Socket client = new Socket("localhost", 9999);

        //2���ȴ����з����������  ������������Կͻ���������
        Scanner scanner = new Scanner(client.getInputStream());
        scanner.useDelimiter("\n");
        if (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        //3���ͻ��˽���
        client.close();
    }


}
