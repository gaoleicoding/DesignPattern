package com.java.designpattern.pattern20_decorator;

public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operate() {
        component.operate();
    }
}
