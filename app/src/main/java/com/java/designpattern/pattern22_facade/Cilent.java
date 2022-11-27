package com.java.designpattern.pattern22_facade;



/**
 * 客户端类
 * @author Administrator
 *
 */
public class Cilent {
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.start();
        computer.shutDown();
    }

}