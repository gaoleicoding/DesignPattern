package com.java.designpattern.pattern19_adapter;

/**
 * 测试类，通过适配器，我们可以获取5V、3V、4V的电压
 */
public class Client {
    public static void main(String[] args) {
        FiveVolt fiveVolt = new ComputerFiveVolt();
        ThreeVolt threeVolt = new PhoneThreeVolt();
        VoltAdapter adapter = new VoltAdapter(fiveVolt,threeVolt);
        System.out.println("电脑输出电压" + adapter.getComputerFiveVolt() + "V");
        System.out.println("手机输出电压" + adapter.getPhoneThreeVolt() + "V");
    }
}