package com.java.study.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Crete by Marlon
 * Create Date: 2018/3/19
 * Class Describe
 **/
public class MyExecutor extends Thread {

    private int index;

    public MyExecutor(int i) {
        this.index = i;
    }

    public void run() {
        try {
            System.out.println("[" + this.index + "] start....");
            Thread.sleep((int) (Math.random() * 1000));
            System.out.println("[" + this.index + "] end.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            service.execute(new MyExecutor(i));
            //service.submit(new MyExecutor(i));
        }
        System.out.println("submit finish");
        service.shutdown();
    }

}
