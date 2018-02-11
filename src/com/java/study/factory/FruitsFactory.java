package com.java.study.factory;


/**
 * Crete by Marlon
 * Create Date: 2018/2/8
 * Class Describe  这就是一个简单的工厂类
 * 但是在实际中根本不可能用到 :  原因是Factory类这么多对象的获取，获取到疯了为止
 * 需要通过反射机制来实现 。
 * <p>
 * 通过反射模式 改进的 工厂设计模式 可以动态的加载类
 * 解决耦合的问题 。
 **/

public class FruitsFactory {


    private FruitsFactory() {

    }

    public static Fruits getInstances(String className) {
        //第一种写法
//        if (className.equals("apple")) {
//            return new Apple();
//        } else if ("orange".equals(className)) {
//            return new Orange();
//        } else {
//            return null;
//        }

        //第二种写法  缺点就是这个 获取的类太单一了
        Fruits fruits = null;
        try {
            fruits = (Fruits) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return fruits;
    }





}
