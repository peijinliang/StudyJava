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

        System.out.println("加法计算" + bigA.add(bigB));
        System.out.println("减法计算" + bigA.subtract(bigB));
        System.out.println("乘法计算" + bigA.multiply(bigB));
        System.out.println("除法计算" + bigA.divide(bigB));

        //不能整除
        BigInteger result[] = bigA.divideAndRemainder(bigB);
        System.out.println("商 = " + result[0] + "  余数 = " + result[1]);

        long start = System.currentTimeMillis();
        //BigDecimal
        double num = 9345983489534580438053480534850384503845083405d;
        System.out.println("乘法计算:" + new BigDecimal(num).pow(139));
        long end = System.currentTimeMillis();
        System.out.println(start - end);


        //进位操作 四舍五入方法
        System.out.println(round(5666.345435345, 2));
        System.out.println(round(5666.342435345, 2));
        System.out.println(round(5666.345035345, 2));

        //Math四舍五入  最简单的操作模式
        System.out.println("Math四舍五入:" + roundMath(5666.345035345, 2));
    }


    /**
     * @param num
     * @param scale
     * @return
     */
    public static double round(double num, int scale) {
        //向上进位
        //BigDecimal divisor, int scale, int roundingMode
        return new BigDecimal(num).divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * 进行四舍五入的操作
     *
     * @param num   原始的操作数据
     * @param scale 保留小数点位数
     * @return 已经正确四舍五入的数据位数
     */
    public static double roundMath(double num, int scale) {
        return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
    }


}
