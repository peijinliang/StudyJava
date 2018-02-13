package com.java.study.io;

import java.io.*;


/**
 * Crete by Marlon
 * Create Date: 11/22/2017
 * Class Describe
 * File �ļ��� ����ѧϰ
 **/
public class FileStream {

    //���һ��С�İ���  ����һ���������������ļ� helloworld.txt���ȥ,Ȼ���ڴ���߶����ӡ
    public static void main(String[] args) {
        mainfileIoTest();
    }

    //�ļ����������������뷽ʽ
    public static void studyFileInputStream() {
        try {
            File file = new File("C:\\Users\\Jin\\Desktop\\zeb4.txt");
            InputStream f = new FileInputStream(file);
            //�رմ��ļ����������ͷ�������йص�����ϵͳ��Դ �׳�IOException�쳣��
            f.close();
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Jin\\Desktop\\zeb4.txt");
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //�ļ������������ʹ�÷�ʽ
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
     * ��bwriteд�뵽�ļ������outputStream��ȥ
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
