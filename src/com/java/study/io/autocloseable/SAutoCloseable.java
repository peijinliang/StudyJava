package com.java.study.io.autocloseable;


/**
 * Crete by Marlon
 * Create Date: 2018/3/14
 * Class Describe
 * 在Try 语句进行操作
 **/

public class SAutoCloseable {

    public static void main(String[] args) throws Exception {
        try (Message message = new Message()) {
            message.print();  //当你执行完成之后自动进行close 操作
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
