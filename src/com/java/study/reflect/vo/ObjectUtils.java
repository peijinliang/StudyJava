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
     * 根据我们的对象制定的属性名称 取得Field 对象信息
     *
     * @param wrapObject 当前操作对象
     * @param attribute  属性
     * @return 属性的对象，如果该属性不存在返回null
     */
    public static Field getObjectField(Object wrapObject, String attribute) throws NoSuchFieldException {
        Field field = wrapObject.getClass().getDeclaredField(attribute);  //取本类属性
        if (field == null) {    //给你第二次取得机会 万一某一些属性需要父类取得
            field = wrapObject.getClass().getField(attribute);     //取得父类属性
        }
        return field;
    }


    /**
     * 负责调用指定类中的Geter方法
     *
     * @param wrapObject 表示要调用方法的所在类对象
     * @param attribute  表示属性名称
     * @return 调用对象的结果
     */
    public static Object getObject(Object wrapObject, String attribute) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException {
        String methodName = "get" + StringUtils.initcap(attribute);
        //调用指定的Field 对象，目的是取得对象类型，如果没有此属性也就没有接下来的操作了
        Field field = getObjectField(wrapObject, attribute);
        if (field == null) {    //两次操作都都无法取得对应的成员对象
            return null; //该属性一定不存在
        }
        Method method = wrapObject.getClass().getMethod(methodName);
        Object object = method.invoke(wrapObject);  //去执行操作
        if (object == null) {
            //所有的程序类都可以通过反射来实现对象的实例化操作，也就是说只需要取得类的对象类型就可以实现该功能了
            object = field.getType().newInstance();  //实例化对象
            setObjectValue(wrapObject, attribute, object);
        }
        return object;
    }


    /**
     * 根据指定的类对象设置指定类的属性 调用Setter方法
     *
     * @param wrapObject 属性所在的实例化对象
     * @param attribute  属性名称
     * @param value      属性内容
     */
    public static void setObjectValue(Object wrapObject, String attribute, Object value) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //调用指定的Field 对象，目的是取得对象类型，如果没有此属性也就没有接下来的操作了
        Field field = getObjectField(wrapObject, attribute);

        if (field == null) {    //两次操作都都无法取得对应的成员对象
            return; //该属性一定不存在
        }
        String methodName = "set" + StringUtils.initcap(attribute);
        Method method = wrapObject.getClass().getMethod(methodName, field.getType());
        method.invoke(wrapObject, value);
    }


}
