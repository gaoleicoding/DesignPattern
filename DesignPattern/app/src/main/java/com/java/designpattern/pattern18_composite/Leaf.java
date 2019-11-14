package com.java.designpattern.pattern18_composite;

/**
 * 简单类
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }
}