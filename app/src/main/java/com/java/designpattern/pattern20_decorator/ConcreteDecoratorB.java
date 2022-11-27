package com.java.designpattern.pattern20_decorator;

public class ConcreteDecoratorB extends Decorator {

    protected ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void operate() {
        initView();
        initData();
        super.operate();
    }

    public void initView() {
        System.out.println("B初始化视图...");
    }

    public void initData() {
        System.out.println("B初始化数据...");
    }
}
