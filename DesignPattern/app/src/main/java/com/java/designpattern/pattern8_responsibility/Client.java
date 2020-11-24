package com.java.designpattern.pattern8_responsibility;

import com.java.designpattern.pattern7_state.AirController;

public class Client {

    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        // 处理事件
        System.out.println("--------------Message1");
        handler1.handleMessage(1);
        System.out.println("--------------Message2");
        handler1.handleMessage(2);
        System.out.println("--------------Message3");
        handler1.handleMessage(4);
        System.out.println("--------------Message4");
        handler1.handleMessage(7);
    }
}