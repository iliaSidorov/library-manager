package com.ilyasidorov.libmanager.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private String type;
    private int student_id;

    public Book() {
    }

    public Book(int id, String title, String author, String type, int student_id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.type = type;
        this.student_id = student_id;
    }

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getStudent_id() {
        return student_id;
    }
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}
