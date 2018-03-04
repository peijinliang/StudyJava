package com.java.study.reflect.vo;

import java.lang.reflect.InvocationTargetException;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * 通过本属性 实现java 类的属性赋值
 * 该程序符合所有java类的
 * <p>
 * 自动实例化关联对象
 **/

public class VoMain {

    public static void main(String[] args) {
        String str = "emp.ename:smith|emp.job:clerk|emp.dept.company.address:浦东大道010号|emp.dept.company.name:浦东新区|emp.dept.dname:技术部|emp.dept.loc:二楼";
        EmpAction empAction = new EmpAction();
        try {
            empAction.setEmpValue(str);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(empAction.getEmp());

//        String str2 = "student.number:123123123123|student.headportrait:头像";
//        StudentAction studentAction = new StudentAction();
//        try {
//            studentAction.setStudentValue(str2);
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
//        System.out.println(studentAction.getStudent());  //如果本类没有toString方法 调用父类的toString方法

    }


}
