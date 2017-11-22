package com.java.study.io;

import java.io.*;

/**
 * Crete by Marlon
 * Create Date: 11/22/2017
 * Class Describe
 * <p>
 * 二进制数据流DataOutputStream、DataInputStream
 **/
public class OtherStream {

    public static void main(String[] args) {
        String inputname = "C:\\Users\\Jin\\Desktop\\zeb4.txt";
        String outname = "C:\\Users\\Jin\\Desktop\\zeb5.txt";
        String apkname = "C:\\Users\\Jin\\Desktop\\read.apk";

        readDataOutputStream(inputname);
        writeDataInputStream(inputname);
//        operationData(inputname, outname);


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


}
