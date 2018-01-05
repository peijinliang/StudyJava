package com.java.study.comm;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 **/
public class ThrowException extends RuntimeException {

    private String msg;

    public ThrowException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
