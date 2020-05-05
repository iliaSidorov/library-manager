package com.ilyasidorov.libmanager.model;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private String faculty;
    private int year;


    public Student(int id, String name, String faculty, int year) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.year = year;
    }

    public Student() {
    }

    //getters & setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}
