package com.java.study.io.copy;

import java.io.File;

/**
 * Crete by Marlon
 * Create Date: 2018/3/14
 * Class Describe
 * ����һ��ר�ž����ļ�copy���ܵĴ����࣬����߱����¹��ܣ�
 * 1����Ҫ�жϿ�����Դ�ļ��Ƿ����
 * 2�� �ж�Ŀ���ļ��ĸ�Ŀ¼�Ƿ���ڣ����������Ӧ�ô���
 * 3����Ҫ�����ļ���copy����
 **/

public class CopyUtil {

    private CopyUtil() {  //���췽��˽�л�

    }

    /**
     * �ж���Ҫ������ԭ·���Ƿ����
     *
     * @param path ��Ҫ�����Դ·����Ϣ
     * @return �����·����ʵ���ڷ���true, ���򷵻�false
     */
    public static boolean fileExists(String path) {
        return new File(path).exists();
    }


    /**
     * ���ݴ����·���жϸ�·���Ƿ���ڣ�����������򴴽�
     *
     * @param path Ҫ�������ļ�·����ͨ����·��ȡ�ø�·��
     */
    public static void createParentDir(String path) {

    }


}
