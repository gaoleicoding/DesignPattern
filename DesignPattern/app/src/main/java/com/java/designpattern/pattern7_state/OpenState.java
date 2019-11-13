package com.java.designpattern.pattern7_state;

public class OpenState extends AirState {

    @Override
    public void powerOn() {
        System.out.println("已启动空调");
    }

    @Override
    public void powerOff() {
        controller.setCurrentState(AirController.STATE_CLOSED);
        controller.getCurrentState().powerOff();

        System.out.println("当前状态为关闭状态");
    }

    @Override
    public void adjustTemp() {
        System.out.println("已调整温度");
    }
}