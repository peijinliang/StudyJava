package com.java.study.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 没有弄懂就不要往下看、看的再快，却养成一个坏习惯.不求甚解 。这就是你以前养成的一个坏习惯
 * 视频只要坚持学，总会看完的   代码只有撸起来，就迟早会搞明白
 * 当然高效学习get其中的含义和知识点 是大于时间
 */
public class ReadMain {

    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask(new CallableThread());
        new Thread(task).start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }



}
