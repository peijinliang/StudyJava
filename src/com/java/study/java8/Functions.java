package com.java.study.java8;


import com.java.study.bean.Article;

import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 * java函数式编程
 **/

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


        BiFunction<String, List<Article>, List<Article>> byAuthor =
                (name, articles) -> articles.stream()
                                            .filter(a -> a.getAuthor().equals(name))
                                            .collect(Collectors.toList());

        BiFunction<String, List<Article>, List<Article>> byTag =
                (tag, articles) -> articles.stream()
                                           .filter(a -> a.getTags().contains(tag))
                                           .collect(Collectors.toList());

        Function<List<Article>, List<Article>> sortByDate =
                articles -> articles.stream()
                                    .sorted((x, y) -> y.published().compareTo(x.published()))
                                    .collect(Collectors.toList());

        Function<List<Article>, Optional<Article>> first =
                a -> a.stream().findFirst();

        Function<List<Article>, Optional<Article>> newest =
                first.compose(sortByDate);

        BiFunction<String, List<Article>, Optional<Article>> newestByAuthor =
                byAuthor.andThen(newest);

        BiFunction<String, List<Article>, List<Article>> byAuthorSorted =
                byAuthor.andThen(sortByDate);

        BiFunction<String, List<Article>, Optional<Article>> newestByTag =
                byTag.andThen(newest);

    }


}
