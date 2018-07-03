package com.java.study.io;

import java.io.*;

/**
 * Crete by Marlon
 * Create Date: 2017/11/9
 * Class Describe
 * <p>
 * JAVA 字符流进行操作
 * * FileReader类从InputStreamReader类继承而来
 * 创建FileReader方法
 * FileReader(File file)
 * FileReader(FileDescriptor fd)
 * FileReader(String fileName)
 * FileWriter
 * <p>
 * 该类按字符向流中写入数据
 * <p>
 * FileWriter(File file)
 * FileWriter(File file, boolean append)
 * FileWriter(FileDescriptor fd)
 * FileWriter(String fileName, boolean append)
 **/

public class CharacterStream {

    public static void main(String[] args) {

        String filename = "C:\\Users\\Jin\\Desktop\\zeb4.txt";
        String apkname = "C:\\Users\\Jin\\Desktop\\read.apk";

        startBufferWriter(filename);
        startBufferReader(filename);

        startStringWriter();
        startStringReader();

        startFileWriter(filename);
        startFileReader(filename);
        studyFileReader();

    }

    public static void startStringReader() {
        String text = "这是一个 StringReader 类";
        StringReader stringReader = new StringReader(text);

        try {
            int len = stringReader.read();
            while (len != -1) {
                System.out.println("line:" + len);
            }
            stringReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void startStringWriter() {

        try {
            StringWriter stringWriter = new StringWriter();
            stringWriter.write("我是 一个");
            stringWriter.append("Java 大神级别的人物");
            stringWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 处理内容较多的数据是，用BufferedWriter更高效
     *
     * @param fileName
     */
    public static void startBufferWriter(String fileName) {

        try {

            BufferedWriter bWrite = new BufferedWriter(new FileWriter(fileName));
            bWrite.write("hell,io");
            bWrite.newLine();
            bWrite.write("welcome to study");
            bWrite.newLine();
            bWrite.write("加油，谢谢！");
            bWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * BufferedReader 一行一行的读取文件速度非常快
     */
    public static void startBufferReader(String fileName) {

        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            String line = read.readLine();
            while (line != null) {
                System.out.println("line:" + line);
                line = read.readLine();
            }
            read.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * @param fileName
     */
    public static void startFileReader(String fileName) {

        try {
            FileReader read = new FileReader(fileName);
            int len = 0;
            len = read.read();
            while (len != -1) {
                System.out.println("len:" + len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * 向文本文件中写内容 直接覆盖文件
     *
     * @param fileName
     */
    public static void startFileWriter(String fileName) {

        FileWriter write = null;
        try {

            write = new FileWriter(fileName);
            write.write("hell,io\n");
            write.write("welcome to study\n");
            write.write("加油，谢谢！");
            write.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void studyFileReader() {

        try {
            File file = new File("Hello1.txt");
            // 创建文件
            file.createNewFile();

            //creates a FileWriter Object
            FileWriter writer = new FileWriter(file);

            // 向文件写入内容
            writer.write("This\n is\n an\n example\n");
            writer.flush();
            writer.close();

            // 创建 FileReader 对象
            FileReader fr = new FileReader(file);

            char[] a = new char[50];

            // 读取数组中的内容
            fr.read(a);
            for (char c : a) {
                // 一个一个打印字符
                System.out.print(c);
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
