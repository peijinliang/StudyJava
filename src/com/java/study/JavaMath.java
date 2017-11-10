package com.java.study;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 * Math 类解析
 **/
public class JavaMath {


    public static void main(String[] args) {
        System.out.println("----------------Math方法--------------");

        System.out.println("返回参数的绝对值:" + Math.abs(-1));
        System.out.println("返回一个随机值（取得一个大于或者等于0.0小于不等于1.0的随机数 ）：" + Math.random());
        System.out.println("返回第一个参数的第二的参数的方" + Math.pow(2, 5));
        System.out.println("返回最大值" + Math.max(2, 5));
        System.out.println("返回最小值" + Math.min(2, 5));
        System.out.println("四舍五入,返回double类型:" + Math.rint(10.1));
        System.out.println("四舍五入,返回double类型:" + Math.rint(10.5));
        System.out.println("四舍五入,返回double类型:" + Math.rint(10.7));

        System.out.println("round 四舍五入，float时返回int值，double时返回long值 " + Math.round(10.42));
        System.out.println("round 四舍五入，float时返回int值，double时返回long值 " + Math.round(10.511));

        System.out.println("ceil天花板的意思，就是返回大的值，注意一些特殊值 " + Math.ceil(-0.7));
        System.out.println("floor地板的意思，就是返回小的值 " + Math.floor(-0.7));

//        常用值与函数：
//        Math.PI 记录的圆周率
//        Math.E 记录e的常量
//        Math中还有一些类似的常量，都是一些工程数学常用量。
//        Math.abs 求绝对值
//        Math.sin 正弦函数 Math.asin 反正弦函数
//        Math.cos 余弦函数 Math.acos 反余弦函数
//        Math.tan 正切函数 Math.atan 反正切函数 Math.atan2 商的反正切函数
//        Math.toDegrees 弧度转化为角度 Math.toRadians 角度转化为弧度
//        Math.ceil 得到不小于某数的最大整数
//        Math.floor 得到不大于某数的最大整数
//        Math.IEEEremainder 求余
//        Math.max 求两数中最大
//        Math.min 求两数中最小
//        Math.sqrt 求开方
//        Math.pow 求某数的任意次方, 抛出ArithmeticException处理溢出异常
//        Math.exp 求e的任意次方
//        Math.log10 以10为底的对数
//        Math.log 自然对数
//        Math.rint 求距离某数最近的整数（可能比某数大，也可能比它小）
//        Math.round 同上，返回int型或者long型（上一个函数返回double型）
//        Math.random 返回0，1之间的一个随机数

        System.out.println("----------------Math方法--------------");
    }


}
