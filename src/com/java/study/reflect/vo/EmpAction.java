package com.java.study.reflect.vo;

import java.lang.reflect.InvocationTargetException;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 **/
public class EmpAction {


    private Emp emp = new Emp();

    public void setEmpValue(String value) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
        //��λҪ�������Ե�����
            BeanOperation.setBeanValue(this, value);
    }

    public Emp getEmp(){
        return emp;
    }




}
