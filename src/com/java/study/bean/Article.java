package com.java.study.bean;

/**
 * Crete by Marlon
 * Create Date: 11/28/2017
 * Class Describe
 **/
public class Article {

    private String author;
    private String tags;
    private Integer published;

    public Integer published() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
