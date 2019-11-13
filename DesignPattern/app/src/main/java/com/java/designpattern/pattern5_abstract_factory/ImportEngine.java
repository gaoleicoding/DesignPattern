package com.java.designpattern.pattern5_abstract_factory;

/**
 * @ClassName ImportEngine
 * @Description 进口发动机
 * @Author lm
 * @Date 2018/9/14 0014 11:23
 * @Version 1.0
 **/
public class ImportEngine implements IEngine{

    @Override
    public void engine() {
        System.out.println("Import engine");
    }
}