package com.java.study.io;

import java.io.*;

/**
 * Crete by Marlon
 * Create Date: 11/22/2017
 * Class Describe  study fileIo
 **/

public class StudyFile {


    public static void main(String[] args) {
        String filename = "C:\\Users\\Jin\\Desktop\\read.apk";
        String pathname = "C:\\Users\\Jin\\Desktop";
        studyFileClass(filename);
        studyFilePath(pathname);
        operationFile(pathname);
    }


    /**
     * ͨ��api�򵥵�ѧϰһ��File��
     *
     * @param filename
     */
    public static void studyFileClass(String filename) {
        File file = new File(filename);
        try {
            System.out.println("�ļ�����-----------" + file.getName());
            System.out.println("�ļ��ľ���·��-----------" + file.getAbsoluteFile());
            System.out.println("����·��-----------" + file.getParent());
            System.out.println("�����ļ�-----------" + file.getParentFile());
            System.out.println("�ļ���·��-----------" + file.getPath());
            System.out.println("�Ƿ�Ϊ����·��-----------" + file.isAbsolute());
            System.out.println("�Ƿ�ɶ�-----------" + file.canRead());
            System.out.println("�Ƿ��д-----------" + file.canWrite());
            System.out.println("�ļ��Ƿ����-----------" + file.exists());
            System.out.println("·���Ƿ�Ϊһ����׼���ļ�-----------" + file.isFile());
            System.out.println("���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼��-----------" + file.isDirectory());
            System.out.println("�ļ����һ�α��޸ĵ�ʱ��-------" + file.lastModified());
            System.out.println("�ļ��ĳ���------" + file.length());
            System.out.println("����ļ������ڴ���һ���µ��ļ�--------" + file.createNewFile());
            System.out.println("ɾ�����ļ���Ŀ¼--------" + file.delete());
//          System.out.println("���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼--------" + file.deleteOnExit());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * ��һЩ������api ��¼һ�£�
     */
    public static void studyFilePath(String dirname) {
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }


    public static void operationFile(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println(filename + "���һ���ļ���");
                String[] fileList = file.getParentFile().list();
                for (int i = 0; i < fileList.length; i++) {
                    System.out.print("---" + fileList[i]);
                }
            } else if (file.isFile()) {
                System.out.println("��ȡ�ļ��ĳ��ȣ�" + file.length());
                //�Ƚ������ļ��Ƿ���ͬһ���ļ�
                File file1 = new File("C:\\Users\\Jin\\Desktop\\read.apk");
                System.out.println("����ĸ˳��Ƚ���������·����---------------------" + file.compareTo(file1));
                System.out.println("���Դ˳���·��������������Ƿ����---------------------" + file.equals(file1));
            }

        } else {
            file.mkdirs();
            file.delete();
        }

    }


}
