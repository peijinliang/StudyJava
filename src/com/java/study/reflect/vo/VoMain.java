package com.java.study.reflect.vo;

import java.lang.reflect.InvocationTargetException;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * ͨ�������� ʵ��java ������Ը�ֵ
 * �ó����������java���
 * <p>
 * �Զ�ʵ������������
 **/

public class VoMain {

    public static void main(String[] args) {
        String str = "emp.ename:smith|emp.job:clerk|emp.dept.company.address:�ֶ����010��|emp.dept.company.name:�ֶ�����|emp.dept.dname:������|emp.dept.loc:��¥";
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

//        String str2 = "student.number:123123123123|student.headportrait:ͷ��";
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
//        System.out.println(studentAction.getStudent());  //�������û��toString���� ���ø����toString����

    }


}
