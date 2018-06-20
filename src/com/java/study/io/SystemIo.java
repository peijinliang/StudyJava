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
//        OutputStream out = System.out; //子类实例向上转型
//        out.write("世界和平".getBytes());
//        out.close();


        InputStream input = System.in;  //实例化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        StringBuffer stringBuffer = new StringBuffer();

        System.out.print("请输入：");
        byte[] data = new byte[100];

        int temp = 0;

        //换行不等于负1
//        while ((temp = input.read(data)) != -1) {   //
        //用户自己进行换行处理，因为换行并不等于文件结束
//            bos.write(data, 0, temp); //保存在内存输出流
//            if (temp < data.length) {
//                break;
//            }
//            System.out.println("*****************：" + temp);
//        }
//        System.out.println("输出的内容为：" + new String(bos.toByteArray()));

        while ((temp = input.read()) != -1) {
            if ('\n' == temp) {
                break;
            }
            stringBuffer.append((char) temp);
        }

        System.out.print("输出的内容为:" + stringBuffer);
        bos.close();
        input.close();
    }


}
