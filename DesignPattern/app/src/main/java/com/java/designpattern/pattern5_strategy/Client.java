package com.java.designpattern.pattern5_strategy;

import com.java.designpattern.pattern1_singleton.SingletonInnerClass;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TrafficCalculator innerClass = new TrafficCalculator();
        innerClass.setStrategy(new SubwayStrategy());
        int price = innerClass.getPrice(16);
        System.out.println("乘坐地铁16km价格：" + price);

    }

}