package com.java.study.reflect.vo;

import java.util.Date;

/**
 * Crete by Marlon
 * Create Date: 2018/3/3
 * Class Describe
 **/
public class Company {

    private Integer cid;
    private String address;
    private String name;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    private java.util.Date create;

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Company{" +
                       "address='" + address + '\'' +
                       ", name='" + name + '\'' +
                       '}';
    }
}
