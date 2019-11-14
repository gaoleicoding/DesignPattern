package com.java.designpattern.pattern16_mediator;

public class D implements User{
    @Override
    public void showMessage(String msg) {
        System.out.print("D"+msg+"\n");
    }
}
