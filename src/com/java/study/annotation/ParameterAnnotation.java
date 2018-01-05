package com.java.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Crete by Marlon
 * Create Date: 12/26/2017
 * Class Describe
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public  @interface ParameterAnnotation {

    public String name();
    public String me();
    public String value();

}
