package com.java.study.datastructure.map;

/**
 * Crete by Marlon
 * Create Date: 2018/3/13
 * Class Describe
 **/

public class SPerson implements Comparable<SPerson> {

    private String name;

    public SPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 快捷键选择属性自动生成
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SPerson)) return false;

        SPerson sPerson = (SPerson) o;

        return getName().equals(sPerson.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }


    @Override
    public String toString() {
        return "SPerson{" +
                       "name='" + name + '\'' +
                       '}';
    }

    /**
     * 重写该方法进行比较
     * @param o
     * @return
     */
    @Override
    public int compareTo(SPerson o) {
        return this.name.compareTo(o.name);
    }
}
