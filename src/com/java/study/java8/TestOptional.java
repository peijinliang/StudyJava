package com.java.study.java8;

import com.java.study.comm.ThrowException;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe  Optional 了解和学习
 * 类来防止返回null值(会导致NullPointerException)
 * http://valleylord.github.io/post/201411-java-new-features/#undefined
 **/
public class TestOptional {

    /**
     * Optional Api解析
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建Optional对象
        Optional<String> opt = Optional.empty();

        //依据一个非空值创建Optional
        Optional<String> opt2 = Optional.of("hello");

        //可接受null的Optional
        Optional<String> opt3 = Optional.ofNullable(null);

        if (!opt3.isPresent()) {
            System.out.println("------------opt3:" + "为空");
            opt3.orElse("world");
        } else {
            System.out.println("------------opt3:" + "不为空");
        }

        Supplier<String> supplier1 = () -> "Test supplier";
        if (!opt.isPresent()) {
            //如果Optional是空，则调用给定的提供者来产生一个值
            System.out.println(opt.orElseGet(supplier1));
        }

        if (!opt.isPresent()) {
            try {
                Supplier<Exception> supplier2 = () -> {
                    return new ThrowException("fuck error");
                };
                opt.orElseThrow(supplier2);
            } catch (Throwable throwable) {
                if (throwable instanceof ThrowException) {
                    ThrowException e = (ThrowException) throwable;
                    System.out.println(e.getMsg());
                }
                throwable.printStackTrace();
            }
        }

        //filter(Predicate<? super T> predicate)
        Predicate<String> predicate = (x) -> x.length() > 0;
        opt2.filter(predicate);
    }


}
