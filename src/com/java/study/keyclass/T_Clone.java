package com.java.study.keyclass;

import com.java.study.reflect.Person;

/**
 * �����¡
 * Object �������colne ����
 * ������������п�¡��ǰ���Ǳ���ʵ�� Cloneable  interface
 * �����׳�CloneNotSupportedException
 * <p>
 * ����Ŀ�¡ʵ��
 * �ؼ���ʶ�ӿ�
 */

public class T_Clone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person("what fuck ?", 20);
        Person perA = (Person) person.clone();
        perA.setAge(30);
        System.out.println("person:" + person.toString());
        System.out.println("personA:" + perA.toString());

    }

}
