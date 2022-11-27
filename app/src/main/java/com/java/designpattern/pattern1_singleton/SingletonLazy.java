package com.java.designpattern.pattern1_singleton;

/**
 * 懒汉模式
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
