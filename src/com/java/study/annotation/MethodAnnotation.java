package com.java.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Crete by Marlon
 * Create Date: 12/25/2017
 * Class Describe
 * ·½·¨×¢½â
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodAnnotation {

    public String name();

    public String value();

}
