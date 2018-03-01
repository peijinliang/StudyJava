package com.java.study.serializable;

import com.java.study.bean.User;

import java.io.*;

/**
 * Crete by Marlon
 * Create Date: 12/6/2017
 * Class Describe
 * java ���л�
 * java.io.Serializable
 * ObjectInputStream �� ObjectOutputStream  ��ʵ�����л�
 * ���л�demo
 * <p>
 * ���л��ĺ��壺���ڴ��б���Ķ����Ϊ�����Ƶ�����������ʽ���д�����߽��䱣�����ı��С�
 * <p>
 * ��Ҫ���л��Ķ�����Ҫ���д������ʹ�� ����Ҫʵ�� Serializable  �ӿ� ��ʶ�ӿ�
 * ���л�����Ϊ�˱�������е����ԡ���������Խ���תΪ������������
 * <p>
 * <p>
 * ObjectOutStream
 * ObjectInputStream
 * <p>
 * java.io�������������л���ʽ Serializable ���Զ����л�
 * Externalizable  �ӿ�����Ҫ�ֶ� �������л�
 * transient �ؼ��֣� �������л�  ��java��������л�
 **/

public class CodeSerializable {


    private static final File FILE = new File("E:" + File.separator + "position.ser");

    public static void main(String[] args) {
        User user = new User("С��", "18988383", 19, "����ʦ");
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
        position.setName("����");
        position.setWork("�������ʦ");
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
