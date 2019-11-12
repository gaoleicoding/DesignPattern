package com.java.designpattern.pattern1_singleton;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonInnerClass innerClass = SingletonInnerClass.getInstance();
        System.out.println("Singleton：" + innerClass.getClass().toString());

    }
}