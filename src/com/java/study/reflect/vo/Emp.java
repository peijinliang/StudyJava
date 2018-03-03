package com.java.study.reflect.vo;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * 存在无参构造
 **/

public class Emp {

    private String job;
    private String ename;


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    @Override
    public String toString() {
        return "Emp{" +
                       "job='" + job + '\'' +
                       ", ename='" + ename + '\'' +
                       '}';
    }
}
