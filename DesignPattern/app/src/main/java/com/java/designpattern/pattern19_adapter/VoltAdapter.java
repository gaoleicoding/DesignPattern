package com.java.designpattern.pattern19_adapter;

/**
 * Adapter角色，将220V的电压转换成5V,4V,3V的电压
 */
public class VoltAdapter extends Volt220 {
    private FiveVolt fiveVolt;
    private ThreeVolt threeVolt;

    public VoltAdapter(FiveVolt fiveVolt, ThreeVolt threeVolt) {
        this.threeVolt = threeVolt;
        this.fiveVolt = fiveVolt;
    }

    public int getComputerFiveVolt() {
        int volt = getVolt220();
        System.out.println("源电压为:" + volt);
        System.out.println("开始转换");
        volt = fiveVolt.getFiveVolt();
        return volt;
    }

    public int getPhoneThreeVolt() {
        int volt = getVolt220();
        System.out.println("源电压为:" + volt);
        System.out.println("开始转换");
        volt = threeVolt.getThreeVolt();
        return volt;
    }
}