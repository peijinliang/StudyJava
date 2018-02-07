package com.java.study.io;

import java.io.*;

/**
 * Crete by Marlon
 * Create Date: 11/22/2017
 * Class Describe
 * <p>
 * 二进制数据流DataOutputStream、DataInputStream
 * ByteArrayInputStream 和 ByteArrayOutputStream的使用
 **/

public class OtherStream {


    public static void main(String[] args) {
        String inputname = "C:\\Users\\Jin\\Desktop\\zeb4.txt";
        String outname = "C:\\Users\\Jin\\Desktop\\zeb5.txt";
        String apkname = "C:\\Users\\Jin\\Desktop\\read.apk";
//      readDataOutputStream(inputname);
//      writeDataInputStream(inputname);
        operationData(inputname, outname);
        try {
            startByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 写二进制流
     *
     * @param fileName
     */
    public static void readDataOutputStream(String fileName) {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));
            out.writeInt(1);
            out.writeDouble(11.20);
            out.writeUTF("test");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 读二进制流
     *
     * @param fileName
     */
    public static void writeDataInputStream(String fileName) {
        try {
            DataInputStream in = new DataInputStream(new FileInputStream(fileName));
            System.out.println(in.readInt() + "-" + in.readDouble() + "-" + in.readUTF());
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 操作数据流
     */
    public static void operationData(String inputname, String outname) {
        DataInputStream d = null;
        try {
            d = new DataInputStream(new FileInputStream(inputname));
            DataOutputStream out = new DataOutputStream(new FileOutputStream(outname));
            String count;
            while ((count = d.readLine()) != null) {
                String u = count.toUpperCase();
                System.out.println(u);
                out.writeBytes(u + "  ,");
            }
            d.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * ByteArray 输入流和输出流的使用
     */
    public static void startByteArray() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(12);
        while (outputStream.size() != 12) {
            try {
                outputStream.write(System.in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        byte b[] = outputStream.toByteArray();
        System.out.println("print the content + 打印内容");
        for (int x = 0; x < b.length; x++) {
            System.out.print((char) b[x] + "  ");
        }
        System.out.println("    ");
        int c;

        ByteArrayInputStream input = new ByteArrayInputStream(b);
        System.out.println("Converting characters to Upper case ");
        for (int y = 0; y < 1; y++) {
            while ((c = input.read()) != -1) {
                System.out.println(Character.toUpperCase((char) c));
            }
            input.reset();
        }
        input.close();
    }



}
