package com.java.study.linked;

/**
 * Crete by Marlon
 * Create Date: 2018/2/3
 * Class Describe
 **/
public class LinkedMain {

    public static void main(String[] args) {
        //��ż����ڵ�
        Node root = new Node("��ͷ");

        Node n1 = new Node("����A");
        Node n2 = new Node("����B");
        Node n3 = new Node("����C");

        //2.��Ҫ���ýڵ�Ĺ�ϵ
        root.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);


        //���õݹ����
        print(root);
    }


    public static void print(Node node) {
        if (node != null) {  //��ʾ��ǰ���ڵĽڵ�
            System.out.println(node.getData());
        }
    }


}
