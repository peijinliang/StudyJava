package com.java.study.linked;

/**
 * Crete by Marlon
 * Create Date: 2018/2/3
 * Class Describe
 **/
public class LinkedMain {

    public static void main(String[] args) {
        //存放几个节点
        Node root = new Node("火车头");

        Node n1 = new Node("车厢A");
        Node n2 = new Node("车厢B");
        Node n3 = new Node("车厢C");

        //2.需要设置节点的关系
        root.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);


        //采用递归操作
        print(root);
    }


    public static void print(Node node) {
        if (node != null) {  //表示当前存在的节点
            System.out.println(node.getData());
        }
    }


}
