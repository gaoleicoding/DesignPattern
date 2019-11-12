package com.java.designpattern.pattern4_abstract_factory;

/**
 * @ClassName NormalBrake
 * @Description 普通发动机
 * @Author lm
 * @Date 2018/9/14 0014 11:27
 * @Version 1.0
 **/
public class NormalBrake implements IBrake{
    @Override
    public void brake() {
        System.out.println("Normal Brake");
    }
}