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
        //1、表示链接到指定服务器端的主机名称和端口号 localhost= 127.0.0.1
        Socket client = new Socket("localhost", 9999);

        //2、等待进行服务器端输出  服务器端输出对客户端是输入
        Scanner scanner = new Scanner(client.getInputStream());
        scanner.useDelimiter("\n");
        if (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        //3、客户端结束
        client.close();
    }


}
