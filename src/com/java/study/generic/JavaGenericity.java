package com.java.study.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe java泛型
 **/

public class JavaGenericity {

    /**
     * java中泛型的本质是参数化类型：也就是说被操作的数据被定义为一个类型
     */
    public static void main(String[] args) {
        Integer[] intArrary = {1, 2, 5, 3, 4, 9, 1};
        Double[] doubleArrary = {1.2, 2.3, 3.3, 4.4, 5.1};
        Character[] charArrary = {'H', 'E', 'L', 'P', 'O'};

        System.out.println("整数型数组元素:");
        printArrary(intArrary);

        System.out.println("\n双精度型数组元素为：");
        printArrary(doubleArrary);

        System.out.println("\n字符型数组元素为：");
        printArrary(charArrary);

        System.out.printf("%d,%d,%d 中最大的参数为%d \n\n", 3, 4, 5, maxNumber(3, 4, 5));
        System.out.printf("%.1f,%.1f,%.1f 中最大的参数为 %.1f\n\n", 6.6, 8.8, 7.7, maxNumber(6.6, 8.8, 7.7));
        System.out.printf("%s,%s,%s 中最大的数为：%s\n", "pear", "apple", "orange", maxNumber("pear", "apple", "orange"));

        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getUperNumber(number);
    }


    /**
     * 有一些数据类型需要给他制定 一个范围
     *
     * @param x
     * @param y
     * @param z
     * @param <T>
     * @return
     */
    public static <T extends Comparable<T>> T maxNumber(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    /**
     * 泛型打印数组 printArrary
     *
     * @param inputArray
     * @param <E>
     */
    public static <E> void printArrary(E[] inputArray) {
        //输出数组
        for (E element : inputArray) {
            //然而这个方法并不能进行排序
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    /**
     * ? 通配符
     *
     * @param data
     */
    public static void getData(List<?> data) {
        System.out.println("data:" + data.get(0));
    }

    /**
     * 指定通配符的上线
     *
     * @param data
     */
    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("dataNumber:" + data.get(0));
    }


}
