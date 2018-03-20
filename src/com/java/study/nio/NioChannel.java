package com.java.study.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Crete by Marlon
 * Create Date: 2018/3/19
 * Class Describe
 **/

public class NioChannel {

    public static void main(String[] args) throws IOException {
        readFile();
        writeFile();
    }

    public static void readFile() throws IOException {
        //从 FileInputStream 获取 Channel
        FileInputStream fout = new FileInputStream("read.text");
        FileChannel fileChannel = fout.getChannel();
        //创建 Buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        //数据从通道读到缓冲区中
        fileChannel.read(byteBuffer);
    }


    public static void writeFile() throws IOException {
        FileOutputStream fout = new FileOutputStream("writesomebytes.txt");
        FileChannel fc = fout.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        byte[] message = "what fuck the channel? 暴力代码".getBytes();

        for (int i = 0; i < message.length; ++i) {
            buffer.put(message[i]);
        }

        buffer.flip();
        fc.write(buffer);
    }


}
