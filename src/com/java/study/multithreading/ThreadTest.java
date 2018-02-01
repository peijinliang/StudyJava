package com.java.study.multithreading;

public class ThreadTest {

    static class MyThread implements Runnable {
        @Override
        public void run() {
            for (int x = 0; x < 2000; x++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+"输出内容" + x);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        //一个主线程中开了多个子线程
        MyThread myThread = new MyThread();
        //setPriority(Thread.MAX_PRIORITY) 设置线程优先级
        new Thread(myThread, "第一个线程").start();
        new Thread(myThread, "第二个线程").start();
        new Thread(myThread, "第三个线程").start();

    }





}
