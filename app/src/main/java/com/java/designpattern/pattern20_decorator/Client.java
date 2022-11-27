package com.java.designpattern.pattern20_decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operate();

        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operate();
    }
}