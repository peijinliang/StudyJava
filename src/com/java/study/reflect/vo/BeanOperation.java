package com.java.study.reflect.vo;

import java.lang.reflect.InvocationTargetException;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * 本类主要负责实现自动的VO匹配处理操作，本身不需要通过实例化对象完成，所以构造方法私有化
 **/
public class BeanOperation {


    private BeanOperation() {

    }

    /**
     * 负责设置类中属性的操作
     *
     * @param actionObject actionObject 表示所有当前发出设置请求的程序类的当前对象
     * @param msg          所有属性的具体内容，格式“属性名称：属性内容|属性名称：属性内容”
     */
    public static void setBeanValue(Object actionObject, String msg) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        //不考虑校验
        String[] rusult = msg.split("\\|");
        for (int i = 0; i < rusult.length; i++) {
            //需要根据给定的属性和名称和内容进行一次拆分
            String[] temp = rusult[i].split(":");   //属性名和内容进行拆分
            String attribute = temp[0];       //属性名称 包含了XXXAction 属性和具体简单java类的属性
            String value = temp[1];          //接受具体的属性和内容
            String fields[] = attribute.split("\\.");  //拆分属性信息
            Object currentObject = ObjectUtils.getObject(actionObject,fields[0]); //getEmp方法 获取到了 Emp对象
            //获取到了Emp 实例化对象   调用他的setter方法 设置值
            ObjectUtils.setObjectValue(currentObject ,fields[1],value);
        }

    }


}
