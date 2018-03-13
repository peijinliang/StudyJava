package com.java.study.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Crete by Marlon
 * Create Date: 2018/3/7
 * Class Describe
 * <p>
 * Crete by Marlon
 * Create Date: 2018/3/7
 * Class Describe  ������
 * Tcp:�ɿ�����������    ��ʽ����Ϣ
 * UDP:���ɿ�����������  ���š�΢��
 * <p>
 * <p>
 * B/S�ṹ�� ��������򡢹���Э�飬�����Ķ˿ڣ���ȫ�Խϲ�
 * C/S�ṹ�� ��ȫ�нϸߡ������ɱ���
 * <p>
 * �ͻ��˺ͷ���˵�����
 * <p>
 * ��򵥵�������ģ��
 **/
public class HelloServer {


    public static void main(String[] args) {
        try {
            //1������һ���������˵Ķ������з�����������һ�������˿�
            ServerSocket server = new ServerSocket(9999);  //��ʱ�ķ�����999�ȴ�����
            System.out.println("�ȴ��ͻ������ӡ���������������");
            //2����Ҫ�ȴ��ͻ�������,Ҳ����˵��ʱ�ĳ�����ڴ˴����뵽һ������״̬
            Socket client = server.accept();  //��ʾ�ȴ����ӣ����ӵĶ��ǿͻ�
            PrintWriter out = new PrintWriter(client.getOutputStream());
            out.println("Hello world");
            out.close();
            //3�� �رշ�����
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
