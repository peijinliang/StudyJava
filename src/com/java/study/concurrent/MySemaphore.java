package com.java.study.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Crete by Marlon
 * Create Date: 2018/3/19
 * Class Describe
 **/
public class MySemaphore extends Thread {

    Semaphore position;
    private int id;

    public MySemaphore(int i, Semaphore s) {
        this.id = i;
        this.position = s;
    }

    public void run() {
        try {
            if (position.availablePermits() > 0) {
                System.out.println("�˿�[" + this.id + "]����������п�λ");
            } else {
                System.out.println("�˿�[" + this.id + "]���������û��λ���Ŷ�");
            }
            position.acquire();
            System.out.println("�˿�[" + this.id + "]��ÿ�λ");
            Thread.sleep((int) (Math.random() * 1000));
            System.out.println("�˿�[" + this.id + "]ʹ�����");
            position.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        ExecutorService list = Executors.newCachedThreadPool();
        Semaphore position = new Semaphore(2);
        for (int i = 0; i < 10; i++) {
            list.submit(new MySemaphore(i + 1, position));
        }
        list.shutdown();
        position.acquireUninterruptibly(2);
        System.out.println("ʹ����ϣ���Ҫ��ɨ��");
        position.release(2);

    }

}
