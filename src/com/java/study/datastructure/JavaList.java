package com.java.study.datastructure;

import com.java.study.bean.Person;

import java.util.*;

/**
 * Crete by Marlon
 * Create Date: 2017/11/9
 * Class Describe
 * Vector �� ArrayList ����
 * ��ʷ�¼���java  1.0  1.2
 * Vector ͬ������,Ч�ʵ�      �̰߳�ȫ
 * ArrayList �첽����,Ч�ʸ�   �̲߳���ȫ
 * <p>
 * <p>
 * <p>
 * LinkedList �� ArrayList ����
 * ArrayList ��װ������        ʱ�临�Ӷ�Ϊ1
 * LinkedList ��װ��Note����   ʱ�临�Ӷ�ΪN  ����
 * <p>
 * Hash �㷨����
 * ������ �㹫԰��ˣ���кܶ���λ
 **/

public class JavaList {


    public static void main(String[] args) {

//        list.contains();
//        list.iterator();

        //  �������鴫��initialCapacity ��ʼ����С
        ArrayList<String> list = new ArrayList<>(5);

        list.add("what fuck?");
        list.add("what fuck?");
        System.out.println(list.toString());


        //�������ظ�  û�ж�Coolection J��������
        Set<String> hashSet = new HashSet<String>();  //����洢
        hashSet.add("Hello");
        hashSet.add("Hello");
        hashSet.add("Hello");
        hashSet.add("Marlon");
        System.out.println(hashSet.toString());


        Set<String> treeSet = new TreeSet<>();    //����洢  ���е����Զ����бȽ�
        treeSet.add("Hello");
        treeSet.add("AAAAA");
        treeSet.add("Hello");
        treeSet.add("Marlon");
        System.out.println(treeSet.toString());


        Set<Person> personSet = new TreeSet<>();    //����洢   TreeSet ����ҪComparable ʵ��
        personSet.add(new Person("�ĺ�", 1));
        personSet.add(new Person("С��", 30));
        personSet.add(new Person("С��", 4));
        personSet.add(new Person("С��", 2));
        personSet.add(new Person("��", 30));
        System.out.println(personSet.toString());

        LinkedList<String> linkedList = new LinkedList<>();

        Vector<String> vector = new Vector<>();


    }


}
