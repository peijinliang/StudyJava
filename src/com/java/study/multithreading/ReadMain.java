package com.java.study.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * û��Ū���Ͳ�Ҫ���¿��������ٿ죬ȴ����һ����ϰ��.�������� �����������ǰ���ɵ�һ����ϰ��
 * ��ƵֻҪ���ѧ���ܻῴ���   ����ֻ��ߣ�������ͳ���������
 * ��Ȼ��Чѧϰget���еĺ����֪ʶ�� �Ǵ���ʱ��
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
