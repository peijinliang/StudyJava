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
 * ���Բ���  ֻ�ܲ���String  ���Խ���Զ���������ݵļ���
 * IO֧�֣�
 * �������ԣ�store(OutputStream out, String comments)
 * ��ȡ���ԣ� load(InputStream inStream)
 * ���ã�����������Ϣ
 **/

public class JavaProperties {


    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.setProperty("key", "value");
        properties.getProperty("keyֵ");
        properties.getProperty("key", "value");

        //��������

        try {
            properties.store(new FileOutputStream(new File("E:" + File.separator + "area.properties")), "Area Info");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //��ȡ����
        Properties properties1 = new Properties();

        try {
            properties1.load(new FileInputStream(new File("E:" + File.separator + "area.properties")));
            System.out.println("------------------------------" + properties.getProperty("key"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //����  Resource Ŀ¼�µ��ļ�
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
