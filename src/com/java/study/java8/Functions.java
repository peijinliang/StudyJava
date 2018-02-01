package com.java.study.java8;

import java.util.function.*;

/**
 * �ڽ�����ʽ�ӿ�
 * java.util.function
 * Lambda�ĺ������ں���ʽ�ӿڣ�������ʽ�ӿڵĺ�������ֻ��һ������
 * ����ֻ������ӿڣ�
 * �в��з���ֵ
 * �в��޷���ֵ
 * �޲����з���ֵ
 * �޲����޷���ֵ
 * <p>
 * �����Եĺ����ӿڣ�
 * public interface Function<T,R>{
 * public R apply(T t);
 * }
 * �����ͺ����ӿڣ�
 * public interface Supplier<T>{
 * T  get();
 * }
 * �����ͽӿڣ�
 * Interface Consumer<T>{
 * void	accept(T t);
 * }
 * <p>
 * �����ͺ���ʽ�ӿڣ�
 * Interface Predicate<T>{
 * boolean	test(T t);
 * }
 */
public class Functions {

    public static void main(String[] args) {
        //����ΪInteger  ����ֵΪString
        Function<Integer, String> fun = String::valueOf;
        System.out.println(fun.apply(1000));
        //��չ��Function �ӿ�
        IntFunction<String> intFunction = String::valueOf;
        System.out.println(intFunction.apply(93939393));

        //����Ӵ����ͽӿ�
        Consumer<String> consumer = System.out::println;
        consumer.accept("��������");

        //�����ͽӿ�
        Supplier<String> supplier = "Hello"::toUpperCase;
        System.out.println(supplier.get());

        //�����ͺ���ʽ�ӿ�
        Predicate<String> predicate = "##Hello"::startsWith;
        System.out.println(predicate.test("#"));


    }
}
