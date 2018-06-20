package com.java.study.java8;

import com.java.study.comm.ThrowException;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe  Optional �˽��ѧϰ
 * ������ֹ����nullֵ(�ᵼ��NullPointerException)
 * http://valleylord.github.io/post/201411-java-new-features/#undefined
 **/
public class TestOptional {

    /**
     * Optional Api����
     *
     * @param args
     */
    public static void main(String[] args) {
        //����Optional����
        Optional<String> opt = Optional.empty();

        //����һ���ǿ�ֵ����Optional
        Optional<String> opt2 = Optional.of("hello");

        //�ɽ���null��Optional
        Optional<String> opt3 = Optional.ofNullable(null);

        if (!opt3.isPresent()) {
            System.out.println("------------opt3:" + "Ϊ��");
            opt3.orElse("world");
        } else {
            System.out.println("------------opt3:" + "��Ϊ��");
        }

        Supplier<String> supplier1 = () -> "Test supplier";
        if (!opt.isPresent()) {
            //���Optional�ǿգ�����ø������ṩ��������һ��ֵ
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
