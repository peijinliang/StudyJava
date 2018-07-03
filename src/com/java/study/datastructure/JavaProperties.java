package com.java.study.datastructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Crete by Marlon
 * Create Date: 2018/2/28
 * Class Describe Properties
 * 属性操作  只能操作String  可以进行远程属性内容的加载
 * IO支持：
 * 保存属性：store(OutputStream out, String comments)
 * 读取属性： load(InputStream inStream)
 * 作用：用来保存信息
 **/

public class JavaProperties {


    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.setProperty("key", "value");
        properties.getProperty("key值");
        properties.getProperty("key", "value");

        //保存属性

        try {
            properties.store(new FileOutputStream(new File("E:" + File.separator + "area.properties")), "Area Info");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //读取属性
        Properties properties1 = new Properties();

        try {
            properties1.load(new FileInputStream(new File("E:" + File.separator + "area.properties")));
            System.out.println("------------------------------" + properties.getProperty("key"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //加载  Resource 目录下的文件
        ResourceBundle resourceBundle = new ResourceBundle() {

            @Override
            protected Object handleGetObject(String key) {
                return null;
            }
            @Override
            public Enumeration<String> getKeys() {
                return null;
            }

        };

    }


}
