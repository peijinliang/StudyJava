package com.java.study.multithreading;

import java.util.concurrent.Callable;

/**
 * 时代变化就是 多线程开发包
 * Callable 接口实现多线程
 */

public class CallableThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.println("买票 x ：" + i);
        }
        return "CallableThread  接口的返回值";
    }

}
