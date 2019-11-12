package com.java.designpattern.pattern4_abstract_factory;

/**
 * @ClassName SUVTire
 * @Description SUV轮胎类
 * @Author lm
 * @Date 2018/9/14 0014 11:23
 * @Version 1.0
 **/
public class SUVTire implements ITire{

    @Override
    public void tire() {
        System.out.println("SUV tire");
    }
}