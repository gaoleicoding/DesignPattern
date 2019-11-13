package com.java.designpattern.pattern7_state;

public abstract class AirState {

    protected AirController controller;

    public abstract void powerOn();

    public abstract void powerOff();

    public abstract void adjustTemp();

    public void setController(AirController controller) {
        this.controller = controller;
    }
}