package com.java.study.io.autocloseable;

/**
 * Crete by Marlon
 * Create Date: 2018/3/14
 * Class Describe
 **/
public class Message implements AutoCloseable {

    public Message() {
        System.out.println("����һ���µ���Ϣ!");
    }

    public void print() throws Exception {
        System.out.println("print!");
       throw  new Exception("���Ӿ��ǲ��رգ�");
    }

    @Override
    public void close() throws Exception {  //�رյĴ������
        System.out.println("��AutoCloseable�� ���йرյķ�������!");
    }

}
