package com.java.designpattern.pattern4_abstract_factory;

/**
 * @ClassName NormalTire
 * @Description 普通轮胎类
 * @Author lm
 * @Date 2018/9/14 0014 11:23
 * @Version 1.0
 **/
public class NormalTire implements ITire{

    @Override
    public void tire() {
        System.out.println("normal tire");
    }
}
