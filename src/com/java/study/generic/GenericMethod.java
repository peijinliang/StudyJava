package com.java.study.generic;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe 泛型方法
 *
 * 为什么要使用泛型方法呢？
 * 1.泛型在实例化的时候要指明类型，如果想换一种类型，需要写很多Code 比较麻烦，
 * 2.指明类型，更加灵活
 **/

public class GenericMethod {

    /**
     * 泛型方法
     *
     * @param clazz 用来创建泛型对象，Class<T>,指明泛型T的具体类型
     * @param <T>   <T> 声明此方法为泛型方法，且有个类型T
     * @return T  泛型T
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public <T> T getObject(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T object = clazz.newInstance();
        return object;
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        GenericMethod genericMethod = new GenericMethod();
        //java泛型
        User user = (User) genericMethod.getObject(Class.forName("com.java.study.generic.User"));
        System.out.println(user);
    }


}
