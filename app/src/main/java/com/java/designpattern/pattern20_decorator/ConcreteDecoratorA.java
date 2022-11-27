package com.java.designpattern.pattern20_decorator;

public class ConcreteDecoratorA extends Decorator {

    protected ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operate() {
        initView();
        initData();
        super.operate();
    }

    public void initView() {
        System.out.println("A初始化视图...");
    }

    public void initData() {
        System.out.println("A初始化数据...");
    }
}
