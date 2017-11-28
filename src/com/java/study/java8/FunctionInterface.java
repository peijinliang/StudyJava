package com.java.study.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 * ����ʽ�ӿ�
 * lambda����Ѻ�����Ϊһ�������Ĳ�����������Ϊ�������ݽ������У�
 * ����Ҫ��⺯��ʽ��̵�ԭ��
 **/
public class FunctionInterface {


    public static void main(String[] args) {
        testfunction();
        testFunction2();
        testSupplier();
        testConsumser();
        testPredicate();
    }

    /**
     * Functionʹ�ã�ת��һ������Ϊ��ͬ���͵Ķ���
     * �������
     */
    public static void testfunction() {
        Function<Integer, String> function1 = (x) -> {
            System.out.println("----------------x:" + x);
            return "  test result " + x;
        };
        Function<String, String> function2 = (x) -> {
            System.out.println("----------------" + x);
            return "after function" + x;
        };
        //1.��ִ��function1��apply��������ִ�� function2��apply��������function1�ķ���ֵ�����������뵽function2��ȥ
        System.out.println(function1.andThen(function2).apply(7));
        System.out.println();
        Function<Integer, Integer> function3 = (x) -> {
            System.out.println("-------------------x:" + x);
            return x * x;
        };
        //��ִ��function3��������4 �������  Ȼ���ڰѷ���ֵ������������ function1��ȥ
        System.out.println(function1.compose(function3).apply(4));
    }

    /**
     * compose �� andThen �Ĳ�֮ͬ���Ǻ���ִ�е�˳��ͬ
     */
    public static void testFunction2() {
        Function<Integer, Integer> times2 = e -> e * 2;
        Function<Integer, Integer> squared = e -> e * e;
        //compose ������ִ�в�����Ȼ��ִ�е�����
        System.out.println(times2.compose(squared).apply(4));
        // Returns 32
        //andThen ��ִ�е����ߣ�Ȼ����ִ�в���
        System.out.println(times2.andThen(squared).apply(4));
        // Returns 64
    }

    /**
     * ��Ӧ��
     * CompletableFuture ����������ṩ��
     * �ṩһ������
     */
    public static void testSupplier() {
        Supplier<String> supplier1 = () -> "Test supplier";
        System.out.println(supplier1.get());
        Supplier<Integer> supplier2 = () -> {
            return 20;
        };
        System.out.println(supplier2.get() instanceof Integer);
    }

    /**
     * ������
     * ���ڽ���һ��������д���û�з���
     */
    public static void testConsumser() {
        Consumer<String> consumer1 = (x) -> System.out.println(x);

        Consumer<String> consumer2 = (x) -> {
            System.out.println("ater");
        };
        consumer1.andThen(consumer2).accept("test consumer1");
    }

    /**
     * Predicate
     * �����б�һ�����󡣱�����һ�����Ƿ�Ϊ����
     */
    public static void testPredicate() {
        Predicate<String> predicate = (x) -> x.length() > 0;
        System.out.print(predicate.test("hehe"));
    }


//        UnaryOperator<T>   ���ն��󲢷���ͬ���͵Ķ���
//        BinaryOperator<T>	  ��������ͬ���͵Ķ��󣬲�����һ��ԭ���Ͷ���



}
