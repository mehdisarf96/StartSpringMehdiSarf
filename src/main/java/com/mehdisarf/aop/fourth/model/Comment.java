package com.mehdisarf.aop.fourth.model;

public class Comment {

    private String author;

    @Override
    public String toString() {
        return "Comment{" + "author='" + author + '\'' + ", text='" + text + '\'' + '}';
    }

    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
