package com.java.designpattern.pattern4_abstract_factory;

/**
 * @ClassName Client
 * @Description 客户端具体实现
 * @Author lm
 * @Date 2018/9/14 0014 11:34
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //构造一个生产Q3的工厂
        CarFactory Q3Factory = new Q3Factory();
        Q3Factory.createTire().tire();
        Q3Factory.createEngine().engine();
        Q3Factory.createBrake().brake();

        System.out.println("===================");
        //构造一个生产Q7的工厂
        CarFactory Q7Factory = new Q7Factory();
        Q7Factory.createTire().tire();
        Q7Factory.createEngine().engine();
        Q7Factory.createBrake().brake();

    }
}