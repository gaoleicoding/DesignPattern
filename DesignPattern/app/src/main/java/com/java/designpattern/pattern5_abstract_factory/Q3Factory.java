package com.java.designpattern.pattern5_abstract_factory;

/**
 * @ClassName Q3Factory
 * @Description 具体生产工厂类Q3
 * @Author lm
 * @Date 2018/9/14 0014 11:32
 * @Version 1.0
 **/
public class Q3Factory extends CarFactory {

    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}