package com.java.study.jstrom;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Crete by Marlon
 * Create Date: 2018/3/6
 * Class Describe
 * 大数据兴起的时候
 * Map:     处理数据
 * Reduce:  分析数据
 * <p>
 * <p>
 * java.util.Collection 和 java.util.Collections区别
 * Collection: 提供了对集合对象进行基本操作的通用接口方法，Collection接口在Java 类库中有很多具体的实现，Collection接口的意义是为各种具体的集合提供了最大化的统一操作方式
 * <p>
 * java.util.Collections 是一个包装类
 * <p>
 * <p>
 * 取出的最大数据量： public Stream<T> limit(long maxSize)
 * 数据量： public Stream<T> skip(long n)
 **/

public class StudyStorm {

    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("1、java");
        all.add("2、php");
        all.add("3、C#");
        all.add("4、.NET");
        all.add("5、Go语言");
        all.add("6、Pythony");
        all.add("7、jsp");
        all.add("8、ajax");
        all.add("9、nginx");
        all.add("10、redis");
//        all.forEach(System.out::println);
//        all.forEach((x) -> {
//            System.out.println(x);
//        });  //方法引用
//        Iterator<String> strings = all.iterator();
//        if (strings.hasNext()) {
//            System.out.println(strings.next());
//        }
        //用一些简单的代码 完成一些比较复杂的业务逻辑操作
        Stream<String> stringStream = all.stream();
//      System.out.println(stringStream.count());

        //简化代码 简化工作量  具体哪一些数据通过筛选
//        System.out.println(stringStream.filter((e) -> e.contains("java")).count());
//        List<String> list = stringStream.filter((e) -> e.contains("java")).collect(Collectors.toList());

//      List<String> list = stringStream.skip(3).limit(2).collect(Collectors.toList());
        List<String> list = stringStream.skip(3).limit(2).map((s) -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);

        List<Order> orders = new ArrayList<>();
        orders.add(new Order("手机号", 1999.00, 20));
        orders.add(new Order("笔记本电脑", 2999.00, 30));
        orders.add(new Order("Java开发", 50.00, 30));
        orders.add(new Order("铅笔", 299.00, 30));
        orders.add(new Order("港币", 50.00, 3000));

        //大数据统计分析

        //算总价
        double totalPrice = orders.stream().map((obj) -> obj.getPrice() * obj.getAmount()).reduce((sum, x) -> sum + x).get();
        System.out.println(totalPrice);

        //利用lamda 简化代码
        DoubleSummaryStatistics toPrice = orders.stream().mapToDouble((obj) -> obj.getPrice() * obj.getAmount()).summaryStatistics();
        System.out.println("Average:" + toPrice.getAverage());
        System.out.println("Count:" + toPrice.getCount());
        System.out.println("Max:" + toPrice.getMax());
        System.out.println("Min:" + toPrice.getMin());
        System.out.println("Sum:" + toPrice.getSum());

        //大数据操作 都在文件

    }


}
