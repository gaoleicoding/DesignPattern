package com.java.designpattern.pattern19_adapter;

public class PhoneThreeVolt implements ThreeVolt {
    @Override
    public int getThreeVolt() {
        return 3;
    }
}