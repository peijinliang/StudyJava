package com.java.study.reflect.vo;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * 根据属性名称调用 相应类的getter 和setter方法
 **/
public class ObjectUtils {

    private ObjectUtils() {

    }

    /**
     * 负责调用指定类中的Geter方法
     *
     * @param wrapObject 表示要调用方法的所在类对象
     * @param attribute  表示属性名称
     * @return 调用对象的结果
     */
    public static Object getObject(Object wrapObject, String attribute) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        String methodName = "get" + StringUtils.initcap(attribute);
        Method method = null;
        //调用指定的Field 对象，目的是取得对象类型，如果没有此属性也就没有接下来的操作了
        Field field = wrapObject.getClass().getDeclaredField(attribute);  //取本类属性
        if (field == null) {    //给你第二次取得机会 万一某一些属性需要父类取得
            field = wrapObject.getClass().getField(attribute);     //取得父类属性
        }
        if (field == null) {    //两次操作都都无法取得对应的成员对象
            return null; //该属性一定不存在
        }
        method = wrapObject.getClass().getMethod(methodName);
        return method.invoke(wrapObject);  //去执行操作
    }


    /**
     * 根据指定的类对象设置指定类的属性 调用Setter方法
     * @param wrapObject 属性所在的实例化对象
     * @param attribute  属性名称
     * @param value      属性内容
     */
    public static void setObjectValue(Object wrapObject, String attribute, String value) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //调用指定的Field 对象，目的是取得对象类型，如果没有此属性也就没有接下来的操作了
        Field field = wrapObject.getClass().getDeclaredField(attribute);  //取本类属性
        if (field == null) {    //给你第二次取得机会 万一某一些属性需要父类取得
            field = wrapObject.getClass().getField(attribute);     //取得父类属性
        }
        if (field == null) {    //两次操作都都无法取得对应的成员对象
            return; //该属性一定不存在
        }
        String methodName = "set" + StringUtils.initcap(attribute);
        Method method = wrapObject.getClass().getMethod(methodName, field.getType());
        method.invoke(wrapObject, value);
    }


}
