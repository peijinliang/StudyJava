package com.java.study.multithreading;

import java.util.concurrent.*;

/**
 * 线程池学习
 * Executors.newCachedThreadPool();  无限大小的线程池
 * Executors.newSingleThreadExecutor(); 单线程线程池
 * Executors.newFixedThreadPool(3);  创建固定大小的线程池
 * <p>
 * 定时调度池
 * Executors.newScheduledThreadPool(3); 创建一个具有三个线程大小的定时调度线程池
 *
 * 线程池的好处就是：允许多个线程按照组的模式，进行程序的处理，在一个逻辑处理非常复杂的情况下，
 * 性能就可以得到很好的提升。
 */

public class ThreadPool {

    public static void main(String[] args) throws InterruptedException {
        //对象一个线程池的模型但是里边没有线程
//        ExecutorService newCachedThreadPool =    Executors.newSingleThreadExecutor();
        ScheduledExecutorService newCachedThreadPool = Executors.newScheduledThreadPool(1);
        for (int x = 0; x < 10; x++) {
//            Thread.sleep(200);
            int size = x;
            //普通执行线程操作
//            newCachedThreadPool.submit(() -> {
//
//            });

            //进行线程调度操作
            /**
             * Runnable command,
             long initialDelay,
             long period,
             TimeUnit unit
             */
            newCachedThreadPool.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " =" + size);
                }
            }, 3, 2, TimeUnit.SECONDS); //三秒钟之后开始执行 两秒钟执行一次
        }
        //关闭线程池
//        newCachedThreadPool.shutdown();
    }


}
