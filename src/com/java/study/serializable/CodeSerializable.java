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
 **/

public class CodeSerializable {

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

    }



}
