package com.java.designpattern.pattern6_state;

public class ClosedState extends AirState {

    @Override
    public void powerOn() {
        controller.setCurrentState(AirController.STATE_OPEN);
        controller.getCurrentState().powerOn();

        System.out.println("当前状态为启动状态");
    }

    @Override
    public void powerOff() {
        System.out.println("已关闭空调");
    }

    @Override
    public void adjustTemp() {
        // no-op
    }
}