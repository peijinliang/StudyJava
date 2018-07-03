package com.java.study.io;

import java.io.*;

/**
 * Crete by Marlon
 * Create Date: 2017/11/9
 * Class Describe
 * <p>
 * JAVA �ַ������в���
 * * FileReader���InputStreamReader��̳ж���
 * ����FileReader����
 * FileReader(File file)
 * FileReader(FileDescriptor fd)
 * FileReader(String fileName)
 * FileWriter
 * <p>
 * ���ఴ�ַ�������д������
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
        String text = "����һ�� StringReader ��";
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
            stringWriter.write("���� һ��");
            stringWriter.append("Java ���񼶱������");
            stringWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * �������ݽ϶�������ǣ���BufferedWriter����Ч
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
            bWrite.write("���ͣ�лл��");
            bWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * BufferedReader һ��һ�еĶ�ȡ�ļ��ٶȷǳ���
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
     * ���ı��ļ���д���� ֱ�Ӹ����ļ�
     *
     * @param fileName
     */
    public static void startFileWriter(String fileName) {

        FileWriter write = null;
        try {

            write = new FileWriter(fileName);
            write.write("hell,io\n");
            write.write("welcome to study\n");
            write.write("���ͣ�лл��");
            write.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void studyFileReader() {

        try {
            File file = new File("Hello1.txt");
            // �����ļ�
            file.createNewFile();

            //creates a FileWriter Object
            FileWriter writer = new FileWriter(file);

            // ���ļ�д������
            writer.write("This\n is\n an\n example\n");
            writer.flush();
            writer.close();

            // ���� FileReader ����
            FileReader fr = new FileReader(file);

            char[] a = new char[50];

            // ��ȡ�����е�����
            fr.read(a);
            for (char c : a) {
                // һ��һ����ӡ�ַ�
                System.out.print(c);
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
