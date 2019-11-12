package com.java.designpattern.pattern4_factory_method;

/**
 * 加
 *
 * @author Administrator
 */
public class OperationAdd extends Operation {
    @Override
    public int getResult() {
        return getX() + getY();
    }
}