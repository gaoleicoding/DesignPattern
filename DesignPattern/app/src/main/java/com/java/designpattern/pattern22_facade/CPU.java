package com.java.designpattern.pattern22_facade;

/**
 * cpu子系统类
 * @author Administrator
 *
 */
public class CPU 
{
    public void start()
    {
        System.out.println("cpu is start...");
    }
    
    public void shutDown()
    {
        System.out.println("CPU is shutDown...");
    }
}