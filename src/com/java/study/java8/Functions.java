package com.java.study.java8;

import java.util.function.*;

/**
 * 内建函数式接口
 * java.util.function
 * Lambda的核心在于函数式接口：而函数式接口的核心在于只有一个方法
 * 核心只有四类接口：
 * 有参有返回值
 * 有参无返回值
 * 无参数有返回值
 * 无参数无返回值
 * <p>
 * 功能性的函数接口：
 * public interface Function<T,R>{
 * public R apply(T t);
 * }
 * 供给型函数接口：
 * public interface Supplier<T>{
 * T  get();
 * }
 * 消费型接口：
 * Interface Consumer<T>{
 * void	accept(T t);
 * }
 * <p>
 * 断言型函数式接口：
 * Interface Predicate<T>{
 * boolean	test(T t);
 * }
 */
public class Functions {

    public static void main(String[] args) {
        //参数为Integer  返回值为String
        Function<Integer, String> fun = String::valueOf;
        System.out.println(fun.apply(1000));
        //扩展的Function 接口
        IntFunction<String> intFunction = String::valueOf;
        System.out.println(intFunction.apply(93939393));

        //肉包子打狗类型接口
        Consumer<String> consumer = System.out::println;
        consumer.accept("我日你妹");

        //供给型接口
        Supplier<String> supplier = "Hello"::toUpperCase;
        System.out.println(supplier.get());

        //断言型函数式接口
        Predicate<String> predicate = "##Hello"::startsWith;
        System.out.println(predicate.test("#"));


    }
}
