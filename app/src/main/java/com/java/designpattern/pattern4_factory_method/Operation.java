package com.java.designpattern.pattern4_factory_method;

/**
 * 计算器的父类
 *
 * @author Administrator
 */
public abstract class Operation {
    private int x;
    private int y;

    public abstract int getResult();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}