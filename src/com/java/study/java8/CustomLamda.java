package com.java.study.java8;

import java.util.function.Consumer;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 * ������������ֻ��һ������
 **/
@FunctionalInterface
public interface CustomLamda<T> {

    T testCustomFunction(Consumer<T> cunsumer);

}
