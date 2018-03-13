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
 * Class Describe  网络编程
 * Tcp:可靠的数据链接    正式的信息
 * UDP:不可靠的数据链接  短信、微信
 * <p>
 * <p>
 * B/S结构： 浏览器程序、公共协议，公开的端口，安全性较差
 * C/S结构： 安全行较高、开发成本高
 * <p>
 * 客户端和服务端的数据
 * <p>
 * 最简单的网络编程模型
 **/
public class HelloServer {


    public static void main(String[] args) {
        try {
            //1、创建一个服务器端的对象，所有服务器对象都有一个监听端口
            ServerSocket server = new ServerSocket(9999);  //此时的服务在999等待链接
            System.out.println("等待客户端链接。。。。。。。。");
            //2、需要等待客户端链接,也就是说此时的程序会在此处进入到一个阻塞状态
            Socket client = server.accept();  //表示等待链接，链接的都是客户
            PrintWriter out = new PrintWriter(client.getOutputStream());
            out.println("Hello world");
            out.close();
            //3、 关闭服务器
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
