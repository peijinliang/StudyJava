package com.java.study.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe java����
 **/

public class JavaGenericity {

    /**
     * java�з��͵ı����ǲ��������ͣ�Ҳ����˵�����������ݱ�����Ϊһ������
     */
    public static void main(String[] args) {
        Integer[] intArrary = {1, 2, 5, 3, 4, 9, 1};
        Double[] doubleArrary = {1.2, 2.3, 3.3, 4.4, 5.1};
        Character[] charArrary = {'H', 'E', 'L', 'P', 'O'};

        System.out.println("����������Ԫ��:");
        printArrary(intArrary);

        System.out.println("\n˫����������Ԫ��Ϊ��");
        printArrary(doubleArrary);

        System.out.println("\n�ַ�������Ԫ��Ϊ��");
        printArrary(charArrary);

        System.out.printf("%d,%d,%d �����Ĳ���Ϊ%d \n\n", 3, 4, 5, maxNumber(3, 4, 5));
        System.out.printf("%.1f,%.1f,%.1f �����Ĳ���Ϊ %.1f\n\n", 6.6, 8.8, 7.7, maxNumber(6.6, 8.8, 7.7));
        System.out.printf("%s,%s,%s ��������Ϊ��%s\n", "pear", "apple", "orange", maxNumber("pear", "apple", "orange"));

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
     * ��һЩ����������Ҫ�����ƶ� һ����Χ
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
     * ���ʹ�ӡ���� printArrary
     *
     * @param inputArray
     * @param <E>
     */
    public static <E> void printArrary(E[] inputArray) {
        //�������
        for (E element : inputArray) {
            //Ȼ��������������ܽ�������
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    /**
     * ? ͨ���
     *
     * @param data
     */
    public static void getData(List<?> data) {
        System.out.println("data:" + data.get(0));
    }

    /**
     * ָ��ͨ���������
     *
     * @param data
     */
    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("dataNumber:" + data.get(0));
    }


}
