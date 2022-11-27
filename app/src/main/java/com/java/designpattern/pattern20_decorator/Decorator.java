package com.java.designpattern.pattern20_decorator;

public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
