package com.java.study.jstrom;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Crete by Marlon
 * Create Date: 2018/3/6
 * Class Describe
 * �����������ʱ��
 * Map:     ��������
 * Reduce:  ��������
 * <p>
 * <p>
 * java.util.Collection �� java.util.Collections����
 * Collection: �ṩ�˶Լ��϶�����л���������ͨ�ýӿڷ�����Collection�ӿ���Java ������кܶ�����ʵ�֣�Collection�ӿڵ�������Ϊ���־���ļ����ṩ����󻯵�ͳһ������ʽ
 * <p>
 * java.util.Collections ��һ����װ��
 * <p>
 * <p>
 * ȡ��������������� public Stream<T> limit(long maxSize)
 * �������� public Stream<T> skip(long n)
 **/

public class StudyStorm {

    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("1��java");
        all.add("2��php");
        all.add("3��C#");
        all.add("4��.NET");
        all.add("5��Go����");
        all.add("6��Pythony");
        all.add("7��jsp");
        all.add("8��ajax");
        all.add("9��nginx");
        all.add("10��redis");
//        all.forEach(System.out::println);
//        all.forEach((x) -> {
//            System.out.println(x);
//        });  //��������
//        Iterator<String> strings = all.iterator();
//        if (strings.hasNext()) {
//            System.out.println(strings.next());
//        }
        //��һЩ�򵥵Ĵ��� ���һЩ�Ƚϸ��ӵ�ҵ���߼�����
        Stream<String> stringStream = all.stream();
//      System.out.println(stringStream.count());

        //�򻯴��� �򻯹�����  ������һЩ����ͨ��ɸѡ
//        System.out.println(stringStream.filter((e) -> e.contains("java")).count());
//        List<String> list = stringStream.filter((e) -> e.contains("java")).collect(Collectors.toList());

//      List<String> list = stringStream.skip(3).limit(2).collect(Collectors.toList());
        List<String> list = stringStream.skip(3).limit(2).map((s) -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);

        List<Order> orders = new ArrayList<>();
        orders.add(new Order("�ֻ���", 1999.00, 20));
        orders.add(new Order("�ʼǱ�����", 2999.00, 30));
        orders.add(new Order("Java����", 50.00, 30));
        orders.add(new Order("Ǧ��", 299.00, 30));
        orders.add(new Order("�۱�", 50.00, 3000));

        //������ͳ�Ʒ���

        //���ܼ�
        double totalPrice = orders.stream().map((obj) -> obj.getPrice() * obj.getAmount()).reduce((sum, x) -> sum + x).get();
        System.out.println(totalPrice);

        //����lamda �򻯴���
        DoubleSummaryStatistics toPrice = orders.stream().mapToDouble((obj) -> obj.getPrice() * obj.getAmount()).summaryStatistics();
        System.out.println("Average:" + toPrice.getAverage());
        System.out.println("Count:" + toPrice.getCount());
        System.out.println("Max:" + toPrice.getMax());
        System.out.println("Min:" + toPrice.getMin());
        System.out.println("Sum:" + toPrice.getSum());

        //�����ݲ��� �����ļ�

    }


}
