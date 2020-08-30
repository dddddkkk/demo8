package com.example.demo.entity;

public class resp {
    int id;
    int classify;
    String title;

    public resp(int id) {
        this.id = id;
    }

    public resp(int id, int classify, String title) {
        this.id = id;
        this.classify = classify;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassify() {
        return classify;
    }

    public void setClassify(int classify) {
        this.classify = classify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
