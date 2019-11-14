package com.java.designpattern.pattern16_mediator;

public class C implements User{
    @Override
    public void showMessage(String msg) {
        System.out.print("C"+msg+"\n");
    }
}
