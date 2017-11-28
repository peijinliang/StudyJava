package com.java.study.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 * 函数式接口
 * lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中）
 * 首先要理解函数式编程的原理
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
     * Function使用：转换一个对象为不同类型的对象
     * 函数组合
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
        //1.先执行function1的apply方法，在执行 function2的apply方法并把function1的返回值当做参数传入到function2中去
        System.out.println(function1.andThen(function2).apply(7));
        System.out.println();
        Function<Integer, Integer> function3 = (x) -> {
            System.out.println("-------------------x:" + x);
            return x * x;
        };
        //先执行function3，并传入4 这个参数  然后在把返回值当做参数传入 function1中去
        System.out.println(function1.compose(function3).apply(4));
    }

    /**
     * compose 和 andThen 的不同之处是函数执行的顺序不同
     */
    public static void testFunction2() {
        Function<Integer, Integer> times2 = e -> e * 2;
        Function<Integer, Integer> squared = e -> e * e;
        //compose 函数先执行参数，然后执行调用者
        System.out.println(times2.compose(squared).apply(4));
        // Returns 32
        //andThen 先执行调用者，然后再执行参数
        System.out.println(times2.andThen(squared).apply(4));
        // Returns 64
    }

    /**
     * 供应者
     * CompletableFuture 在这个类中提供的
     * 提供一个对象
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
     * 消费者
     * 用于接收一个对象进行处理但没有返回
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
     * 用于判别一个对象。比如求一个人是否为男性
     */
    public static void testPredicate() {
        Predicate<String> predicate = (x) -> x.length() > 0;
        System.out.print(predicate.test("hehe"));
    }


//        UnaryOperator<T>   接收对象并返回同类型的对象
//        BinaryOperator<T>	  接收两个同类型的对象，并返回一个原类型对象



}
