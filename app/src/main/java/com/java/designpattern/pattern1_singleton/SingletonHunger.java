package com.java.designpattern.pattern1_singleton;
/**
 * 饿汉模式
 */
public class SingletonHunger {
    private static final SingletonHunger instance = new SingletonHunger();

    private SingletonHunger() {
    }

    public SingletonHunger getInstance() {
        return instance;
    }
}
