package com.java.study.reflect.vo;

import java.lang.reflect.InvocationTargetException;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 **/
public class EmpAction {


    private Emp emp ;

    public void setEmpValue(String value) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException, InstantiationException {
        //定位要操作属性的类型
            BeanOperation.setBeanValue(this, value);
    }

    public Emp getEmp(){
        return emp;
    }


    public void setEmp(Emp emp) {
        this.emp = emp;
    }
}
