package com.java.designpattern.pattern5_strategy;

public class SubwayStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int distance) {

        if (distance < 6) return 3;
        if (distance > 6 && distance < 12) return 4;
        if (distance > 12 && distance < 22) return 5;
        if (distance > 22 && distance < 32) return 6;
        return 3;
    }
}
