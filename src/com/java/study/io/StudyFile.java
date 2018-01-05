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
     * 通过api简单的学习一下File类
     *
     * @param filename
     */
    public static void studyFileClass(String filename) {
        File file = new File(filename);
        try {
            System.out.println("文件名称-----------" + file.getName());
            System.out.println("文件的绝对路径-----------" + file.getAbsoluteFile());
            System.out.println("父类路径-----------" + file.getParent());
            System.out.println("父类文件-----------" + file.getParentFile());
            System.out.println("文件的路径-----------" + file.getPath());
            System.out.println("是否为绝对路径-----------" + file.isAbsolute());
            System.out.println("是否可读-----------" + file.canRead());
            System.out.println("是否可写-----------" + file.canWrite());
            System.out.println("文件是否存在-----------" + file.exists());
            System.out.println("路径是否为一个标准的文件-----------" + file.isFile());
            System.out.println("测试此抽象路径名表示的文件是否是一个目录。-----------" + file.isDirectory());
            System.out.println("文件最后一次被修改的时间-------" + file.lastModified());
            System.out.println("文件的长度------" + file.length());
            System.out.println("如果文件不存在创建一个新的文件--------" + file.createNewFile());
            System.out.println("删除该文件或目录--------" + file.delete());
//          System.out.println("在虚拟机终止时，请求删除此抽象路径名表示的文件或目录--------" + file.deleteOnExit());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 有一些基本的api 记录一下：
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
                System.out.println(filename + "这个一个文件件");
                String[] fileList = file.getParentFile().list();
                for (int i = 0; i < fileList.length; i++) {
                    System.out.print("---" + fileList[i]);
                }
            } else if (file.isFile()) {
                System.out.println("获取文件的长度：" + file.length());
                //比较两个文件是否是同一个文件
                File file1 = new File("C:\\Users\\Jin\\Desktop\\read.apk");
                System.out.println("按字母顺序比较两个抽象路径名---------------------" + file.compareTo(file1));
                System.out.println("测试此抽象路径名与给定对象是否相等---------------------" + file.equals(file1));
            }

        } else {
            file.mkdirs();
            file.delete();
        }

    }


}
