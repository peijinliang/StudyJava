package com.java.study.java8;

import java.util.function.Consumer;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 * 改类有且允许只有一个参数
 **/
@FunctionalInterface
public interface CustomLamda<T> {

    T testCustomFunction(Consumer<T> cunsumer);

}
