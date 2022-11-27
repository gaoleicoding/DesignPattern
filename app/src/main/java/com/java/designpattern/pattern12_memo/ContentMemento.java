package com.java.designpattern.pattern12_memo;

public class ContentMemento {
    private String content;

    public ContentMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}