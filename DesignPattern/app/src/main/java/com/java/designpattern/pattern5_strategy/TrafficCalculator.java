package com.java.designpattern.pattern5_strategy;

public class TrafficCalculator {

    CalculateStrategy strategy;
    public void setStrategy(CalculateStrategy strategy){
        this.strategy=strategy;
    }
    public int getPrice(int distance){
        return   strategy.calculatePrice(distance);
    }
}
