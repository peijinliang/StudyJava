package com.java.study.io.copy;

import java.io.File;

/**
 * Crete by Marlon
 * Create Date: 2018/3/14
 * Class Describe
 * 建立一个专门具有文件copy功能的处理类，该类具备如下功能：
 * 1、需要判断拷贝的源文件是否存在
 * 2、 判断目标文件的父目录是否存在，如果不存在应该创建
 * 3、需要进行文件的copy操作
 **/

public class CopyUtil {

    private CopyUtil() {  //构造方法私有化

    }

    /**
     * 判断需要拷贝的原路径是否存在
     *
     * @param path 需要输入的源路径信息
     * @return 如果该路径真实存在返回true, 否则返回false
     */
    public static boolean fileExists(String path) {
        return new File(path).exists();
    }


    /**
     * 根据传入的路径判断父路径是否存在，如果不存在则创建
     *
     * @param path 要操作的文件路径，通过此路径取得父路径
     */
    public static void createParentDir(String path) {

    }


}
