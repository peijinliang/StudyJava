package com.java.study.java8;

import com.java.study.bean.Article;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 * javaº¯ÊýÊ½±à³Ì
 **/

public class Functions {

    public static void main(String[] args) {
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
