package com.java.study.multithreading;

import java.util.concurrent.Callable;

/**
 * ʱ���仯���� ���߳̿�����
 * Callable �ӿ�ʵ�ֶ��߳�
 */

public class CallableThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.println("��Ʊ x ��" + i);
        }
        return "CallableThread  �ӿڵķ���ֵ";
    }

}
