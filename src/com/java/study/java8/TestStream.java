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
 * Class Describe java8 ������
 * java��Stream��ʹ��
 **/
public class TestStream {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("С��", "1", 10));
        users.add(new User("С��", "2", 20));
        users.add(new User("С��", "3", 30));

//        startStream(users);
//        testcollect();
//        testMap();
//        testMaxMin();
//        testReduce();
//        testparallel();
        
        testSorted();
    }

    /**
     * Stream�򻯴���
     * ���м���Collection ������ת��ΪStream
     * ��ʽ���÷�������һ������������дҲ�������Ķ�������д�ߵ���ͼ��һ��������һ����
     */
    public static void startStream(List<User> users) {
        long count = 0;
        for (User p : users) {
            if (p.getAge() > 20) {
                count++;
            }
        }
        System.out.println(count);
        //Streamд��
        long counts = users.stream().filter(user -> user.getAge() > 0).count();
        System.out.println(counts);
    }

    /**
     * �����̫��
     * һ��ж�����ֵ��һ��м�����ֵ
     */
    public static void testcollect() {
        List<String> collected = Stream.of("a", "b", "c").collect(toList());
//        assertEquals(Arrays.asList("a", "b", "c"), collected);
    }

    /**
     * mapһ���������Խ�һ�����͵�ֵת��������һ������
     * ʵ���Ͼ��ǵ�����Function ����������ʵ��
     */
    public static void testMap() {
        List<String> collected = Stream.of("a", "b", "c").map(string -> string.toUpperCase()).collect(toList());
//        assertEquals(Arrays.asList("A", "B", "C"), collected);
    }


    /**
     * ��鲢�������е�Ԫ��(�����͹���)
     * ������Predicate ����������ʵ��
     */
    public static void testfilter() {
        List<String> beginningWithNumbers = Stream.of("a", "b", "c").filter(value -> isDigit(value.charAt(0))).collect(toList());
//        assertEquals(Arrays.asList("1abc"), beginningWithNumbers);
    }

    /**
     * flatMap
     * �����Stream ���һ�� Stream
     * ��õĲ������Ǻϲ���� Collection
     */
    public static void testflatMap() {
        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)).flatMap(numbers -> numbers.stream()).collect(toList());
//        assertEquals(Arrays.asList(1, 2, 3, 4), together);
    }

    /**
     * �������ֵ��Сֵ
     * 1.Optional
     * 2.Integer::compareTo  java8�еķ�������
     * �൱�ڣ�(int1, int2) -> int1.compareTo(int2)
     * compareTo �Ƚϴ�С�ķ���
     */
    public static void testMaxMin() {
        List<Integer> list = Arrays.asList(3, 5, 2, 9, 1);
        int maxInt = list.stream().max(Integer::compareTo).get();
        int minInt = list.stream().min(Integer::compareTo).get();
        System.out.println("maxInt:" + maxInt);
        System.out.println("minInt:" + minInt);
    }


    /**
     * reduce��������ʵ�ִ�һ��ֵ������һ��ֵ
     */
    public static void testReduce() {
        int result = Stream.of(1, 2, 3, 4).reduce(1, (acc, element) -> acc + element);
        System.out.println("�ۼӽ��:" + result);
        int result2 = Stream.of(1, 2, 3, 4)
                              .reduce(1, (acc, element) -> acc * element);
        System.out.println("�۳˽��:" + result2);
    }


    /**
     * ���ݲ��л�����
     * 1���ݲ��л���ָ�����ݷֳɿ飬Ϊÿ�����ݷ��䵥���Ĵ���Ԫ���������Գ�����ö�� CPU �����ơ��ӿ����кʹ����ٶ�
     * 2.����Ѿ���һ�� Stream ���󣬵������� parallel() ������������ӵ�в��в�����������
     * 3.������һ�������ഴ��һ���������� parallelStream() �����������һ��ӵ�в�������������
     * ִ�����̣�
     * 1.���ݲ��л����ȶ����ݽ��зֿ�
     * 2.���ݲ��л����ȶ����ݽ��зֿ�
     * �ܽ᣺���ݹ�ģ�Ƚϴ� ���� ���ݵĴ���ʱ��Ƚϳ� ��ʱ��������ֳ����£����Բ�����ÿ���ط�����Ҫ�����ݲ��л���Ӧ�þ�������������
     */
    public static void testparallel() {
        int sunSize = Stream.of("Apple", "Banana", "Orange", "Pear").parallel().map(s -> s.length()).reduce(Integer::sum).get();
        System.out.println("����������ĸ���ܳ���" + sunSize);
    }

    /**
     * sorted ��������
     */
    public static void testSorted() {
        List<Integer> list = Arrays.asList(3, 5, 1, 10, 8, 30);
        List<Integer> sortedList = list.stream().sorted(Integer::compareTo).collect(toList());
        sortedList.forEach(n -> System.out.println(n));
    }


}
