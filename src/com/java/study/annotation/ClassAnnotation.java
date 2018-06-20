package com.java.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Crete by Marlon
 * Create Date: 12/25/2017
 * Class Describe
 * �Զ���java ע����
 * ע�Ȿ����ǣ�һ��ע�ͻ���˵��һ��Ԫ����
 * ��Χ��������ʹ��Ԥ���빤�߽��д���pre-compiler tools����Ҳ������������ʹ�� Java ������ƽ��д���
 * ��ע��
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassAnnotation {

    public String name();

    public String value();

}
