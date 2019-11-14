package com.java.designpattern.pattern16_mediator;

public class A implements User{
    @Override
    public void showMessage(String msg) {
        System.out.print("A"+msg+"\n");
    }
}

