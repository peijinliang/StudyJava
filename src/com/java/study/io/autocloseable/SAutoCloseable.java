package com.java.study.io.autocloseable;


/**
 * Crete by Marlon
 * Create Date: 2018/3/14
 * Class Describe
 * ��Try �����в���
 **/

public class SAutoCloseable {

    public static void main(String[] args) throws Exception {
        try (Message message = new Message()) {
            message.print();  //����ִ�����֮���Զ�����close ����
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
