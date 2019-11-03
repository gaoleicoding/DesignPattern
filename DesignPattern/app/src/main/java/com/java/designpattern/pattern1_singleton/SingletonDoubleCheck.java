package com.java.designpattern.pattern1_singleton;

/**
 * 双重检查模式
 */
public class SingletonDoubleCheck {
    private static SingletonDoubleCheck instance = null;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
