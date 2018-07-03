package com.java.study.network;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Crete by Marlon
 * Create Date: 2018/3/7
 * Class Describe
 * 并发编程实际上就是：每一个用户的链接对服务器共享资源的控制。
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
//          Socket client = server.accept();  //等待链接

            Scanner scanner = new Scanner(client.getInputStream());  //接受客户度的输入
            scanner.useDelimiter("\n");

            PrintStream out = new PrintStream(client.getOutputStream());
            boolean flag = true;   //作为循环执行的标记
            while (flag) {  //相当于一直循环
                if (scanner.hasNext()) {   //相当于客户端有数据发送
                    String str = scanner.next().trim();  //防止多余空格出现
                    if ("byebye".equalsIgnoreCase(str)) {
                        out.println("BYEBYE!!!:" + str);
                        flag = false;  //此时循环退出
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
