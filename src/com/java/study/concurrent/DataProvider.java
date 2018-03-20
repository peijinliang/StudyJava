package com.java.study.concurrent;

public class DataProvider implements Runnable {

    private Data data;

    public DataProvider(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.data.setTitle("雷锋");
                this.data.setNote("是一个好人");
            } else {
                this.data.setTitle("罪犯");
                this.data.setNote("是一个坏人");
            }
        }
    }


}
