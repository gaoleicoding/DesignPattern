package com.java.designpattern.pattern5_abstract_factory;

/**
 * @ClassName CarFactory
 * @Description 抽象汽车工厂类
 * @Author lm
 * @Date 2018/9/14 0014 11:16
 * @Version 1.0
 **/
public abstract class CarFactory {
    /**
     * 生产轮胎
     * return 生产轮胎
     */
    public abstract ITire createTire();
    /**
     * 生产发动机
     * return 发动机
     */
    public abstract IEngine createEngine();
    /**
     * 生产制动系统
     * return 制动系统
     */
    public abstract IBrake createBrake();

}
