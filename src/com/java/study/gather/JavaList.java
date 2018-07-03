package com.java.study.gather;

import com.java.study.bean.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Crete by Marlon
 * Create Date: 2017/11/9
 * Class Describe
 * List接口下
 * ArrayList
 * Vector
 * ArryList是基于数组实现的 ,基于数组动态增长
 *
 **/

public class JavaList {

    public static void main(String[] args) {

        Collection<User> user = new ArrayList<>();
        List<User> list = new ArrayList<>();

        UnaryOperator<User> unaryOperator = UnaryOperator.identity();
//      list.replaceAll(unaryOperator);   //根据operator指定的计算规则重新设置List集合的所有元素
//      list.sort(Comparator c);根据Comparator参数对List集合的元素排序

    }


}
