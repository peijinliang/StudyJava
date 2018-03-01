package com.java.study.serializable;

import com.java.study.bean.User;

import java.io.*;

/**
 * Crete by Marlon
 * Create Date: 12/6/2017
 * Class Describe
 * java 序列化
 * java.io.Serializable
 * ObjectInputStream 和 ObjectOutputStream  来实现序列化
 * 序列化demo
 * <p>
 * 序列化的含义：将内存中保存的对象变为二进制的数据流的形式进行传输或者将其保存在文本中。
 * <p>
 * 需要序列化的对象都是要进行传输进行使用 但是要实现 Serializable  接口 标识接口
 * 序列化就是为了保存对象中的属性。对象的属性将被转为二进制数据流
 * <p>
 * <p>
 * ObjectOutStream
 * ObjectInputStream
 * <p>
 * java.io包中有两种序列化方式 Serializable 是自动序列化
 * Externalizable  接口能需要手动 进行序列化
 * transient 关键字： 跳过序列化  简单java类进行序列化
 **/

public class CodeSerializable {


    private static final File FILE = new File("E:" + File.separator + "position.ser");

    public static void main(String[] args) {
        User user = new User("小红", "18988383", 19, "工程师");
        File file = new File("user.out");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(user);
            fos.close();
            out.close();

            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            User user2 = (User) inputStream.readObject();
            fileInputStream.close();
            inputStream.close();
            System.out.println("User:" + user2.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        User position = new User();
        position.setAge(1111);
        position.setName("张三");
        position.setWork("软件工程师");
        position.setID("23494949");
        ser(position);
        getSer();
    }

    public static void ser(Object obj) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE));
            oos.writeObject(obj);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void getSer() {
        try {
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream(FILE));
            System.out.println("-----------------" + oos.readObject());
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
