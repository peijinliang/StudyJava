package com.java.study.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Crete by Marlon
 * Create Date: 2018/3/7
 * Class Describe
 * Echo ����
 **/

public class EchoServer {


    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        //�ȴ�����  ʵ�ֶ��̵߳Ĳ���
        Socket client = server.accept();
        new MyThread(client).run();

//        ServerSocket server = new ServerSocket(8888);
//        Socket client = server.accept();  //�ȴ�����
//        Scanner scanner = new Scanner(client.getInputStream());  //���ܿͻ��ȵ�����
//        scanner.useDelimiter("\n");
//
//        PrintStream out = new PrintStream(client.getOutputStream());
//        boolean flag = true;   //��Ϊѭ��ִ�еı��
//        while (flag) {  //�൱��һֱѭ��
//            if (scanner.hasNext()) {   //�൱�ڿͻ��������ݷ���
//                String str = scanner.next().trim();  //��ֹ����ո����
//                if ("byebye".equalsIgnoreCase(str)) {
//                    out.println("BYEBYE!!!:" + str);
//                    flag = false;  //��ʱѭ���˳�
//                }
//                out.println("ECHO:" + str);
//            }
//        }
//        out.close();
//        scanner.close();
//        server.close();
    }


}
