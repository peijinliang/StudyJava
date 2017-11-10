package com.java.study.enumeration;

/**
 * Crete by Marlon
 * Create Date: 2017/11/10
 * Class Describe
 **/
public enum ErrorCodeEn implements INumberEnum {

    OK(0, "�ɹ�"),
    ERROR_A(100, "����A"),
    ERROR_B(200, "����B");


    ErrorCodeEn(int number, String description) {
        this.code = number;
        this.description = description;
    }

    private int code;
    private String description;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }


}
