package com.java.study.java8;

/**
 * 方法引用:本质就是别名，实际上也就是别名的使用
 * 引用静态方法：类名称 :: static 方法名称
 * 引用某个对象的方法： 实例化对象:: 普通方法
 * 引用某个特定类的方法： 类名称:: 普通方法
 * 引用构造方法 :  类名称 :: new
 * <p>
 * 都需要借用函数式接口完成
 * 是Lambda的一个补充
 */

public class MethodReference {

    @FunctionalInterface
    public interface IUtil<P, R> {
        public R zhuanhuan(P p);
    }

    @FunctionalInterface
    public interface UpperCase<R> {
        public R zhuanhuan();
    }

    @FunctionalInterface
    public interface CompareTo<R, P> {
        public R comptTo(P p1, P p2);
    }

    @FunctionalInterface
    public interface PersonUtil<R, FP, SP> {
        public R create(FP fp, SP sp);
    }

    public static void main(String[] args) {
        IUtil<Integer, String> ui = (p1) -> String.valueOf(p1);  //可以理解为
        IUtil<Integer, String> iu = String::valueOf;  //进行方法引用
        String str = iu.zhuanhuan(1000);
        System.out.println("字符串长度：" + str.length());

        //以前的写法
        UpperCase<String> upper = new UpperCase<String>() {
            @Override
            public String zhuanhuan() {

                return "Hello".toUpperCase();
            }
        };

        UpperCase<String> Case = () -> "Hello".toUpperCase();

        //现在的写法
        UpperCase<String> upperCase = "Hello"::toUpperCase;
        System.out.println(upperCase.zhuanhuan());

        //方法引用
        CompareTo<Integer, String> compareTo = String::compareTo;
        System.out.println(compareTo.comptTo("H", "A"));

        PersonUtil<Person, String, Integer> personUtil = Person::new;
        System.out.println(personUtil.create("小红", 20));
    }

}
