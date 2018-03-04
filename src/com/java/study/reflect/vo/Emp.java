package com.java.study.reflect.vo;

import java.util.Date;

/**
 * Crete by Marlon
 * Create Date: 2018/3/1
 * Class Describe
 * 存在无参构造
 **/

public class Emp {

    private String job;
    private String ename;

    private Double salary;
    private java.util.Date hiredate;

    private Dept dept ;


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }



    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

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
                       ", dept=" + dept +
                       '}';
    }
}
