package com.java.study;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Crete by Marlon
 * Create Date: 2018/2/7
 * Class Describe
 * Bigteger
 * BigDecimal
 **/

public class T_BigInteger {


    public static void main(String[] args) {
        BigInteger bigA = new BigInteger("44946464634164645646748463134165467496");
        BigInteger bigB = new BigInteger("4494646463416");

        System.out.println("�ӷ�����" + bigA.add(bigB));
        System.out.println("��������" + bigA.subtract(bigB));
        System.out.println("�˷�����" + bigA.multiply(bigB));
        System.out.println("��������" + bigA.divide(bigB));

        //��������
        BigInteger result[] = bigA.divideAndRemainder(bigB);
        System.out.println("�� = " + result[0] + "  ���� = " + result[1]);

        long start = System.currentTimeMillis();
        //BigDecimal
        double num = 9345983489534580438053480534850384503845083405d;
        System.out.println("�˷�����:" + new BigDecimal(num).pow(139));
        long end = System.currentTimeMillis();
        System.out.println(start - end);


        //��λ���� �������뷽��
        System.out.println(round(5666.345435345, 2));
        System.out.println(round(5666.342435345, 2));
        System.out.println(round(5666.345035345, 2));

        //Math��������  ��򵥵Ĳ���ģʽ
        System.out.println("Math��������:" + roundMath(5666.345035345, 2));
    }


    /**
     * @param num
     * @param scale
     * @return
     */
    public static double round(double num, int scale) {
        //���Ͻ�λ
        //BigDecimal divisor, int scale, int roundingMode
        return new BigDecimal(num).divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * ������������Ĳ���
     *
     * @param num   ԭʼ�Ĳ�������
     * @param scale ����С����λ��
     * @return �Ѿ���ȷ�������������λ��
     */
    public static double roundMath(double num, int scale) {
        return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
    }


}
