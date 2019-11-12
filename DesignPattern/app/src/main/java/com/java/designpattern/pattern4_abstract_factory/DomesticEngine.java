package com.java.designpattern.pattern4_abstract_factory;

/**
 * @ClassName DomesticEngine
 * @Description 国产发动机
 * @Author lm
 * @Date 2018/9/14 0014 11:23
 * @Version 1.0
 **/
public class DomesticEngine implements IEngine{

    @Override
    public void engine() {
        System.out.println("domestic engine");
    }
}