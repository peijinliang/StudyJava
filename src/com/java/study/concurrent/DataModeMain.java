package com.java.study.concurrent;

public class DataModeMain {

    public static void main(String[] args) {
        Data data = new Data();

        new Thread(new DataProvider(data)).start();

        new Thread(new DataConsumer(data)).start();
    }

}
