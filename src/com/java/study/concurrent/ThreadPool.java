package com.java.study.concurrent;

import java.util.concurrent.*;

/**
 * �̳߳�ѧϰ
 * Executors.newCachedThreadPool();  ���޴�С���̳߳�
 * Executors.newSingleThreadExecutor(); ���߳��̳߳�
 * Executors.newFixedThreadPool(3);  �����̶���С���̳߳�
 * <p>
 * ��ʱ���ȳ�
 * Executors.newScheduledThreadPool(3); ����һ�����������̴߳�С�Ķ�ʱ�����̳߳�
 * <p>
 * �̳߳صĺô����ǣ��������̰߳������ģʽ�����г���Ĵ�����һ���߼�����ǳ����ӵ�����£�
 * ���ܾͿ��Եõ��ܺõ�������
 */

public class ThreadPool {

    public static void main(String[] args) throws InterruptedException {
        //����һ���̳߳ص�ģ�͵������û���߳�
//        ExecutorService newCachedThreadPool =    Executors.newSingleThreadExecutor();
        ScheduledExecutorService newCachedThreadPool = Executors.newScheduledThreadPool(1);
        for (int x = 0; x < 10; x++) {
//            Thread.sleep(200);
            int size = x;
            //��ִͨ���̲߳���
//            newCachedThreadPool.submit(() -> {

//            });

            //�����̵߳��Ȳ���
            /**
             * Runnable command,
             * long initialDelay,  �Ƴ�ʱ��
             * long period,  ʱ��
             * TimeUnit unit   ʱ��λ
             */

            newCachedThreadPool.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " =" + size);
                }
            }, 3, 2, TimeUnit.SECONDS); //������֮��ʼִ�� ������ִ��һ��
        }
        //�ر��̳߳�
//        newCachedThreadPool.shutdown();
    }


}
