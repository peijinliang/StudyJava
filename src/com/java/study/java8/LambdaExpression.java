package com.java.study.java8;

import com.java.study.bean.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Crete by Marlon
 * Create Date: 11/27/2017
 * Class Describe Lambda 表达式
 * <p>
 * 1.相当于匿名内部类的效果
 * 2.闭包
 * 3.方法引用
 **/

public class LambdaExpression {

    public static void main(String args[]) {
//      testdescrStyle();
        methodReference();
    }

    /**
     * java 函数式编程的几种形式
     */
    public static void testdescrStyle() {

        //空括号表示没有任何参数
        Runnable noArguments = () -> System.out.println("Hello World");

        //仅仅包含一个参数，可以省却括号
        ActionListener oneArgument = (event) -> System.out.println("button clicked");

        //主体可以是{}包含起来的代码块
        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" World");
        };

        //表示可以有多个参数
        BinaryOperator<Long> add = (x, y) -> x + y;
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
    }

    /**
     * 闭包
     * 无需将变量声明为 final
     */
    public static void testclosure() {
        Button button = new Button();
        final String name = "what's your name?";

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("hi " + name);
            }
        });

        String names = "what's your name?";
        ActionListener actionListener = (event) -> {
            System.out.println("hi " + names);
        };
    }

    /**
     * 方法引用的唯一用途是支持Lambda的简写
     * 方法引用是一个更加紧凑，易读的Lambda表达式，注意方法引用是一个Lambda表达式，其中方法引用的操作符是双冒号
     * 方法引用的分类:
     */

    /**
     * 引用静态方法
     * 引用特定对象的实例方法
     * 引用特定类型的任意对象的实例方法
     * 引用构造函数
     * 这个地方依旧不会举一反三
     */
    public static void methodReference() {
        Supplier<User> c1 = User::new;
        User s1 = c1.get();

        Function<String, Integer> stringToInteger = Integer::parseInt;
        Function<Integer, User> c2 = i -> new User(i);
        User s3 = c2.apply(100);

        //静态方法引用  Class::staticMethodName
        List<Integer> integers = Arrays.asList(1, 3, 4, 5, 19);
        Optional<Integer> max = integers.stream().reduce(Math::max);

        max.ifPresent(value -> System.out.println(value));

        //从对象中引用实例方法 ClassInstance::instanceMethodName
        max.ifPresent(System.out::println);

        //引用特定类型的实例方法 - Class::instanceMethodName
        List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sorted = strings.stream().sorted((x, y) -> x.compareTo(y)).collect(Collectors.toList());

        System.out.println(sorted);

        List<String> sortedAlt = strings.stream()
                                         .sorted(String::compareTo)
                                         .collect(Collectors.toList());
        System.out.println(sortedAlt);

        //引用构造函数 - Class::new
        List<Integer> integers2 = IntStream.range(1, 100)
                                          .boxed()
                                          .collect(Collectors.toCollection(ArrayList::new));
        integers2.forEach(n -> System.out.print(n + "  "));
        Optional<Integer> max2 = integers2.stream().reduce(Math::max);

        max2.ifPresent(System.out::println);
    }


}
