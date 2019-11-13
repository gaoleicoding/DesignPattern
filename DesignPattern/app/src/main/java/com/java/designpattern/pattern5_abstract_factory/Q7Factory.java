package com.java.designpattern.pattern5_abstract_factory;

/**
 * @ClassName Q7Factory
 * @Description 具体生产工厂类Q7
 * @Author lm
 * @Date 2018/9/14 0014 11:33
 * @Version 1.0
 **/
public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}