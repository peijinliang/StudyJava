package com.java.study.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Crete by Marlon
 * Create Date: 2018/2/27
 * Class Describe java ����
 * Queue : �Ƚ��ȳ�
 * �߲�����ʵ������һ������
 **/
public class JavaQueue {


    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll()); //�����˾��� NULL
    }

}
