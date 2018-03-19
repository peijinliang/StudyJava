package com.java.study.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Crete by Marlon
 * Create Date: 2018/2/26
 * Class Describe  加密和解密
 * 密码学  具体的原理
 **/

public class JavaBase64 {

    public static void main(String[] args) {
        System.getProperties().list(System.out);

        String msg = "www.360zebra.com";
        String eMsg = Base64.getEncoder().encodeToString(msg.getBytes());

        System.out.println("加密后的信息：" + encode(eMsg));
        System.out.println("加密第二次：" + encode(encode(eMsg)));
        System.out.println("加密第三次：" + encode(encode(encode(eMsg))));

        byte[] data = Base64.getDecoder().decode(eMsg);
        System.out.println("解密后的信息：" + new String(data));

        //    "加密内容" +"加秘钥"  Base64转换     MD5

        //只使用一次加密等于没有加密
        String md532 = parseStrToMd5L32(msg);
        System.out.println("MD5 ：" + md532);

    }

    //多次加密
    public static String encode(String msg) {
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }


    /**
     * @param str
     * @return
     * @Date: 2013-9-6
     * @Author: lulei
     * @Description: 32位小写MD5
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
     * @Description: 32位大写MD5
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
     * @Description: 16位小写MD5
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
     * @Description: 16位大写MD5
     */
    public static String parseStrToMd5L16(String str) {
        String reStr = parseStrToMd5L32(str);
        if (reStr != null) {
            reStr = reStr.substring(8, 24);
        }
        return reStr;
    }


}
