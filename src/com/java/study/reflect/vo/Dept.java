package com.java.study.reflect.vo;

/**
 * Crete by Marlon
 * Create Date: 2018/3/3
 * Class Describe
 **/
public class Dept {

    private String dname;
    private String loc;
    private Long count;  //员工数量
    private Company company;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                       "dname='" + dname + '\'' +
                       ", loc='" + loc + '\'' +
                       ", company=" + company +
                       '}';
    }

}
