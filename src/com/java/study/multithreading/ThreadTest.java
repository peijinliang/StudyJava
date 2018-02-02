package com.java.study.multithreading;

public class ThreadTest {

    static class MyThread implements Runnable {
        @Override
        public void run() {
            for (int x = 0; x < 2000; x++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+"�������" + x);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        //һ�����߳��п��˶�����߳�
        MyThread myThread = new MyThread();
        //setPriority(Thread.MAX_PRIORITY) �����߳����ȼ�
        new Thread(myThread, "��һ���߳�").start();
        new Thread(myThread, "�ڶ����߳�").start();
        new Thread(myThread, "�������߳�").start();

    }





}
