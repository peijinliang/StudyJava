package com.java.study.java8;

import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 * <p>
 * CompletableFuture 去了解java的多线程开启了一道门
 * http://blog.csdn.net/zjysource/article/details/54409772
 * demo：在两个线程里并行执行任务A和任务B，只要有一个任务完成了，就执行任务C
 * <p>
 * 这个demo我并没有完全吃透，等我看完java多线程 以及并发处理的时候在来回顾一下
 **/

public class TestCompletableFuture {

    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        userFuture();

        TimeUnit.SECONDS.sleep(10);
        System.out.println();

        useCompletableFuture();
    }

    public static void userFuture() throws InterruptedException, ExecutionException {

        ExecutorService exector = Executors.newFixedThreadPool(3);
        Future<Void> futureA = exector.submit(() -> work("A1"));
        Future<Void> futureB = exector.submit(() -> work("B1"));

        while (true) {
            try {
                futureA.get(1, TimeUnit.SECONDS);
                break;
            } catch (TimeoutException e) {

            }
            try {
                futureB.get(1, TimeUnit.SECONDS);
                break;
            } catch (TimeoutException e) {
            }

        }
        exector.submit(() -> work("C1")).get();
        exector.shutdown();
    }


    public static void useCompletableFuture() throws InterruptedException, ExecutionException {

        System.out.println("--------------useCompletableFuture----------");
        CompletableFuture<Void> futureA = CompletableFuture.runAsync(() -> work("A2"));
        CompletableFuture<Void> futureB = CompletableFuture.runAsync(() -> work("B2"));
        futureA.runAfterEither(futureB, () -> work("C2")).get();

    }


    public static Void work(String name) {

        System.out.println(name + " starts at" + LocalTime.now());
        try {
            TimeUnit.SECONDS.sleep(random.nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " ends at" + LocalTime.now());

        return null;
    }


}
