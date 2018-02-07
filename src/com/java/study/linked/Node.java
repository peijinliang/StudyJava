package com.java.study.linked;

/**
 * Crete by Marlon
 * Create Date: 2018/2/3
 * Class Describe
 * Ϊ�˽����ڴ����ĺ�����
 * ����ĳ��ȱ���������Ĵ�С������
 **/
public class Node {

    private Object data;
    private Node next;  //������һ���ڵ������

    public Node(Object data) {
        this.data = data;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                       "data=" + data +
                       ", next=" + next +
                       '}';
    }


}
