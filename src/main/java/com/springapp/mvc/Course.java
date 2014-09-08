package com.springapp.mvc;

/**
 * User: Jamshid Asatillayev
 * Date: 9/8/2014
 * Time: 13:43 PM
 */
public class Course {
    private String name;
    private Integer id;

    public Course(int i, String test) {
        id = i;
        name = test;
    }
    public Course() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getName();
    }
}
