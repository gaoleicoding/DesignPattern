package com.java.designpattern.pattern5_strategy;

public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int distance) {
        return 2 + ((distance - 10) % 8);
    }
}
