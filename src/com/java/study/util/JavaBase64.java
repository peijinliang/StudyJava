package com.java.study.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Crete by Marlon
 * Create Date: 2018/2/26
 * Class Describe  ���ܺͽ���
 * ����ѧ  �����ԭ��
 **/

public class JavaBase64 {

    public static void main(String[] args) {
        System.getProperties().list(System.out);

        String msg = "www.360zebra.com";
        String eMsg = Base64.getEncoder().encodeToString(msg.getBytes());

        System.out.println("���ܺ����Ϣ��" + encode(eMsg));
        System.out.println("���ܵڶ��Σ�" + encode(encode(eMsg)));
        System.out.println("���ܵ����Σ�" + encode(encode(encode(eMsg))));

        byte[] data = Base64.getDecoder().decode(eMsg);
        System.out.println("���ܺ����Ϣ��" + new String(data));

        //    "��������" +"����Կ"  Base64ת��     MD5

        //ֻʹ��һ�μ��ܵ���û�м���
        String md532 = parseStrToMd5L32(msg);
        System.out.println("MD5 ��" + md532);

    }

    //��μ���
    public static String encode(String msg) {
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }


    /**
     * @param str
     * @return
     * @Date: 2013-9-6
     * @Author: lulei
     * @Description: 32λСдMD5
     */
    public static String parseStrToMd5L32(String str) {
        String reStr = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bytes) {
                int bt = b & 0xff;
                if (bt < 16) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(Integer.toHexString(bt));
            }
            reStr = stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return reStr;
    }

    /**
     * @param str
     * @return
     * @Date: 2013-9-6
     * @Author: lulei
     * @Description: 32λ��дMD5
     */
    public static String parseStrToMd5U32(String str) {
        String reStr = parseStrToMd5L32(str);
        if (reStr != null) {
            reStr = reStr.toUpperCase();
        }
        return reStr;
    }

    /**
     * @param str
     * @return
     * @Date: 2013-9-6
     * @Author: lulei
     * @Description: 16λСдMD5
     */
    public static String parseStrToMd5U16(String str) {
        String reStr = parseStrToMd5L32(str);
        if (reStr != null) {
            reStr = reStr.toUpperCase().substring(8, 24);
        }
        return reStr;
    }

    /**
     * @param str
     * @return
     * @Date: 2013-9-6
     * @Author: lulei
     * @Description: 16λ��дMD5
     */
    public static String parseStrToMd5L16(String str) {
        String reStr = parseStrToMd5L32(str);
        if (reStr != null) {
            reStr = reStr.substring(8, 24);
        }
        return reStr;
    }


}
