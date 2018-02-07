package com.java.study.linked;

/**
 * Crete by Marlon
 * Create Date: 2018/2/3
 * Class Describe
 * 为了降低内存消耗和垃圾
 * 数组的长度必须由数组的大小来决定
 **/
public class Node {

    private Object data;
    private Node next;  //挂载下一个节点的内容

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
