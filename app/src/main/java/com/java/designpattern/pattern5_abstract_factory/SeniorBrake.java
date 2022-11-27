package com.java.designpattern.pattern5_abstract_factory;

/**
 * @ClassName SeniorBrake
 * @Description 高级发动机
 * @Author lm
 * @Date 2018/9/14 0014 11:27
 * @Version 1.0
 **/
public class SeniorBrake implements IBrake{
    @Override
    public void brake() {
        System.out.println("Senior Brake");
    }
}