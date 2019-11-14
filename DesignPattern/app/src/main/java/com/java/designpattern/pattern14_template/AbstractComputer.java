package com.java.designpattern.pattern14_template;

public abstract class AbstractComputer {

    protected void powerOn() {
        System.out.println("开启电源");
    }

    protected void checkHardWare() {
        System.out.println("硬件检查");
    }

    protected void loadOS() {
        System.out.println("载入操作系统");
    }

    protected void login() {
        System.out.println("通过用户验证");
    }

    public final void startUp() {
        System.out.println("--------开机  START----------");
        powerOn();
        checkHardWare();
        loadOS();
        login();
        System.out.println("--------关机  END----------");

    }
}
