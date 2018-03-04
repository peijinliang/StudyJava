package com.java.study.reflect.vo;

import com.java.study.reflect.Student;

import java.lang.reflect.InvocationTargetException;

/**
 * Crete by Marlon
 * Create Date: 2018/3/3
 * Class Describe
 **/
public class StudentAction {

    private Student student = new Student();

    public void setStudentValue(String value) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException, InstantiationException {
        //定位要操作属性的类型
        BeanOperation.setBeanValue(this, value);
    }

    public Student getStudent(){
        return student;
    }





}
