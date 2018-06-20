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
 * Echo 反射
 **/

public class EchoServer {


    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        //等待链接  实现多线程的操作
        Socket client = server.accept();
        new MyThread(client).run();

//        ServerSocket server = new ServerSocket(8888);
//        Socket client = server.accept();  //等待链接
//        Scanner scanner = new Scanner(client.getInputStream());  //接受客户度的输入
//        scanner.useDelimiter("\n");
//
//        PrintStream out = new PrintStream(client.getOutputStream());
//        boolean flag = true;   //作为循环执行的标记
//        while (flag) {  //相当于一直循环
//            if (scanner.hasNext()) {   //相当于客户端有数据发送
//                String str = scanner.next().trim();  //防止多余空格出现
//                if ("byebye".equalsIgnoreCase(str)) {
//                    out.println("BYEBYE!!!:" + str);
//                    flag = false;  //此时循环退出
//                }
//                out.println("ECHO:" + str);
//            }
//        }
//        out.close();
//        scanner.close();
//        server.close();
    }


}
