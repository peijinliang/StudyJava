package com.java.study.java8;

import com.java.study.bean.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.lang.Character.isDigit;
import static java.util.stream.Collectors.toList;

/**
 * Crete by Marlon
 * Create Date: 2017/11/9
 * Class Describe java8 新特性
 * java中Stream的使用
 **/
public class TestStream {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("小明", "1", 10));
        users.add(new User("小红", "2", 20));
        users.add(new User("小花", "3", 30));

//        startStream(users);
//        testcollect();
//        testMap();
//        testMaxMin();
//        testReduce();
//        testparallel();
        
        testSorted();
    }

    /**
     * Stream简化代码
     * 所有集成Collection 都可以转化为Stream
     * 链式调用方法算是一个主流，这样写也更利于阅读和理解编写者的意图，一步方法做一件事
     */
    public static void startStream(List<User> users) {
        long count = 0;
        for (User p : users) {
            if (p.getAge() > 20) {
                count++;
            }
        }
        System.out.println(count);
        //Stream写法
        long counts = users.stream().filter(user -> user.getAge() > 0).count();
        System.out.println(counts);
    }

    /**
     * 这个不太懂
     * 一类叫惰性求值，一类叫及早求值
     */
    public static void testcollect() {
        List<String> collected = Stream.of("a", "b", "c").collect(toList());
//        assertEquals(Arrays.asList("a", "b", "c"), collected);
    }

    /**
     * map一个函数可以将一种类型的值转换成另外一种类型
     * 实际上就是调用了Function 的匿名函数实现
     */
    public static void testMap() {
        List<String> collected = Stream.of("a", "b", "c").map(string -> string.toUpperCase()).collect(toList());
//        assertEquals(Arrays.asList("A", "B", "C"), collected);
    }


    /**
     * 检查并遍历其中的元素(遍历和过滤)
     * 调用了Predicate 的匿名函数实现
     */
    public static void testfilter() {
        List<String> beginningWithNumbers = Stream.of("a", "b", "c").filter(value -> isDigit(value.charAt(0))).collect(toList());
//        assertEquals(Arrays.asList("1abc"), beginningWithNumbers);
    }

    /**
     * flatMap
     * 将多个Stream 变成一个 Stream
     * 最常用的操作就是合并多个 Collection
     */
    public static void testflatMap() {
        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)).flatMap(numbers -> numbers.stream()).collect(toList());
//        assertEquals(Arrays.asList(1, 2, 3, 4), together);
    }

    /**
     * 处理最大值最小值
     * 1.Optional
     * 2.Integer::compareTo  java8中的方法引用
     * 相当于：(int1, int2) -> int1.compareTo(int2)
     * compareTo 比较大小的方法
     */
    public static void testMaxMin() {
        List<Integer> list = Arrays.asList(3, 5, 2, 9, 1);
        int maxInt = list.stream().max(Integer::compareTo).get();
        int minInt = list.stream().min(Integer::compareTo).get();
        System.out.println("maxInt:" + maxInt);
        System.out.println("minInt:" + minInt);
    }


    /**
     * reduce操作可以实现从一组值中生成一个值
     */
    public static void testReduce() {
        int result = Stream.of(1, 2, 3, 4).reduce(1, (acc, element) -> acc + element);
        System.out.println("累加结果:" + result);
        int result2 = Stream.of(1, 2, 3, 4)
                              .reduce(1, (acc, element) -> acc * element);
        System.out.println("累乘结果:" + result2);
    }


    /**
     * 数据并行化操作
     * 1数据并行化是指将数据分成块，为每块数据分配单独的处理单元。这样可以充分利用多核 CPU 的优势。加快运行和处理速度
     * 2.如果已经有一个 Stream 对象，调用它的 parallel() 方法就能让其拥有并行操作的能力。
     * 3.如果想从一个集合类创建一个流，调用 parallelStream() 就能立即获得一个拥有并行能力的流。
     * 执行流程：
     * 1.数据并行化会先对数据进行分块
     * 2.数据并行化会先对数据进行分块
     * 总结：数据规模比较大 或者 数据的处理时间比较长 的时候才能体现出有事，所以并不是每个地方都需要让数据并行化，应该具体问题具体分析
     */
    public static void testparallel() {
        int sunSize = Stream.of("Apple", "Banana", "Orange", "Pear").parallel().map(s -> s.length()).reduce(Integer::sum).get();
        System.out.println("输入所有字母的总长度" + sunSize);
    }

    /**
     * sorted 进行排序
     */
    public static void testSorted() {
        List<Integer> list = Arrays.asList(3, 5, 1, 10, 8, 30);
        List<Integer> sortedList = list.stream().sorted(Integer::compareTo).collect(toList());
        sortedList.forEach(n -> System.out.println(n));
    }


}
