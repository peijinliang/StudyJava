package com.java.study.io;

import java.io.*;


/**
 * Crete by Marlon
 * Create Date: 11/22/2017
 * Class Describe
 * File 文件流 进行学习
 **/
public class FileStream {

    //设计一个小的案例  创建一个输出流，输出到文件 helloworld.txt里边去,然后在从里边读入打印
    public static void main(String[] args) {
        mainfileIoTest();
    }

    //文件输入流的两种输入方式
    public static void studyFileInputStream() {
        try {
            File file = new File("C:\\Users\\Jin\\Desktop\\zeb4.txt");
            InputStream f = new FileInputStream(file);
            //关闭此文件输入流并释放与此流有关的所有系统资源 抛出IOException异常。
            f.close();
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Jin\\Desktop\\zeb4.txt");
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //文件输出流的两种使用方式
    public static void studyFileOutputStream() {
        try {
            File file = new File("C:/java/hello");
            OutputStream outputStream = new FileOutputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Jin\\Desktop\\helloworld.txt");
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 把bwrite写入到文件输出流outputStream中去
     */
    public static void mainfileIoTest() {
        byte bwrite[] = {11, 34, 40, 50};
        try {
            OutputStream outputStream = new FileOutputStream("C:\\Users\\Jin\\Desktop\\helloworld.txt");
            for (int i = 0; i < bwrite.length; i++) {
                outputStream.write(bwrite[i]);
            }
            outputStream.close();

            InputStream inputStream = new FileInputStream("C:\\Users\\Jin\\Desktop\\helloworld.txt");
            int size = inputStream.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char) inputStream.read() + "");
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
