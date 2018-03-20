package com.java.study.concurrent;

public class DataConsumer implements Runnable {

    private Data data;

    DataConsumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.data.getTitle() + " =" + this.data.getNote());
        }
    }


}
