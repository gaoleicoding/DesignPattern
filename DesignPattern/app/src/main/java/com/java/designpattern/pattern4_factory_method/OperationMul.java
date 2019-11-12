package com.java.designpattern.pattern4_factory_method;

/**
 * 乘
 *
 * @author Administrator
 */
public class OperationMul extends Operation {
    @Override
    public int getResult() {
        return getX() * getY();
    }
}