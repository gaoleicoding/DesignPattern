package com.java.designpattern.pattern8_responsibility;

public abstract class Handler {
    // 下一个责任链成员
    protected Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 处理传递过来的事件
    public abstract void handleMessage(int type);
}