package com.java.designpattern.pattern19_adapter;

public class ComputerFiveVolt implements FiveVolt {
    @Override
    public int getFiveVolt() {
        return 5;
    }

}