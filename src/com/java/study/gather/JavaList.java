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
 * List�ӿ���
 * ArrayList
 * Vector
 * ArryList�ǻ�������ʵ�ֵ� ,�������鶯̬����
 *
 **/

public class JavaList {

    public static void main(String[] args) {

        Collection<User> user = new ArrayList<>();
        List<User> list = new ArrayList<>();

        UnaryOperator<User> unaryOperator = UnaryOperator.identity();
//      list.replaceAll(unaryOperator);   //����operatorָ���ļ��������������List���ϵ�����Ԫ��
//      list.sort(Comparator c);����Comparator������List���ϵ�Ԫ������

    }


}
