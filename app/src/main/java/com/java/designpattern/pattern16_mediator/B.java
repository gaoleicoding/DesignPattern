package com.java.designpattern.pattern16_mediator;

public class B implements User{
    @Override
    public void showMessage(String msg) {
        System.out.print("B"+msg+"\n");
    }
}
