package com.java.study.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: 2018/2/14
 * Class Describe 迭代器
 **/
public class ListIterator {

    public static void main(String[] args) {

        List<String> all = new ArrayList<>();
        all.add("Hello");
        all.add("a");
        all.add("Hello");
        all.add("World");

        Iterator<String> iterator = all.iterator();  //实例化Iterator 接口对象
        while (iterator.hasNext()) {
            String str = iterator.next();
            if ("a".equals(str)) {
//               all.remove(str);   //删除  后边中断执行
                iterator.remove();
                continue;
            }
            System.out.println(str);
        }

    }


}
