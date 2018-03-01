package com.java.study.util;

import java.util.Base64;

/**
 * Crete by Marlon
 * Create Date: 2018/2/26
 * Class Describe  加密和解密
 * 密码学  具体的原理
 **/

public class JavaBase64 {


    public static void main(String[] args) {
        String msg = "www.360zebra.com";
        String eMsg = Base64.getEncoder().encodeToString(msg.getBytes());
        System.out.println("加密后的信息：" + eMsg);
        byte[] data = Base64.getDecoder().decode(eMsg);
        System.out.println("解密后的信息：" + new String(data));

        //    "加密内容" +"加秘钥"  Base64转换     MD5
        //只使用一次加密等于没有加密
    }

    //多次加密
    public static String encode(String msg) {
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }

    
}
