package com.java.designpattern.pattern8_responsibility;

public abstract class Handler {

    protected Handler nextHandler; // 下一个责任链成员

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 处理传递过来的时间
    public abstract void handleMessage(int type);
}