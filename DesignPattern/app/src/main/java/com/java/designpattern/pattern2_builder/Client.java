package com.java.designpattern.pattern2_builder;

import com.java.designpattern.pattern1_singleton.SingletonInnerClass;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Computer computer = new Computer.Builder()
                .setCpu("Intel Core i7")
                .setMotherboard("GIGABYTE Z97")
                .setDisplayCard("GTX Titan")
                .setRam("32G")
                .setDisk("2TB")
                .setPower("1000W")
                .create();

        System.out.println("computer：" + computer.toString());
    }
}