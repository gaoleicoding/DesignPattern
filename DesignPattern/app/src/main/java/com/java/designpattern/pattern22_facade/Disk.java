package com.java.designpattern.pattern22_facade;

/**
 * Disk子系统类
 * @author Administrator
 *
 */
public class Disk
{

    public void start()
    {
        System.out.println("Disk is start...");
    }
    
    public void shutDown()
    {
        System.out.println("Disk is shutDown...");
    }
}