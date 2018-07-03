package com.java.study.network;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Crete by Marlon
 * Create Date: 2018/3/7
 * Class Describe
 * �������ʵ���Ͼ��ǣ�ÿһ���û������ӶԷ�����������Դ�Ŀ��ơ�
 **/

public class MyThread implements Runnable {

    private Socket client;

    public MyThread(Socket socket) {
        this.client = socket;
    }

    @Override
    public void run() {
        try {

//          ServerSocket server = new ServerSocket(8888);
//          Socket client = server.accept();  //�ȴ�����

            Scanner scanner = new Scanner(client.getInputStream());  //���ܿͻ��ȵ�����
            scanner.useDelimiter("\n");

            PrintStream out = new PrintStream(client.getOutputStream());
            boolean flag = true;   //��Ϊѭ��ִ�еı��
            while (flag) {  //�൱��һֱѭ��
                if (scanner.hasNext()) {   //�൱�ڿͻ��������ݷ���
                    String str = scanner.next().trim();  //��ֹ����ո����
                    if ("byebye".equalsIgnoreCase(str)) {
                        out.println("BYEBYE!!!:" + str);
                        flag = false;  //��ʱѭ���˳�
                    }
                    out.println("ECHO:" + str);
                }
            }

            out.close();
            scanner.close();
            client.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
