package com.java.study.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: 2018/2/14
 * Class Describe ������
 **/
public class ListIterator {

    public static void main(String[] args) {

        List<String> all = new ArrayList<>();
        all.add("Hello");
        all.add("a");
        all.add("Hello");
        all.add("World");

        Iterator<String> iterator = all.iterator();  //ʵ����Iterator �ӿڶ���
        while (iterator.hasNext()) {
            String str = iterator.next();
            if ("a".equals(str)) {
//               all.remove(str);   //ɾ��  ����ж�ִ��
                iterator.remove();
                continue;
            }
            System.out.println(str);
        }

    }


}
