package com.java.designpattern.pattern4_factory_method;
/**
 * 减
 * @author Administrator
 *
 */
public class OperationSub extends Operation{
	@Override
	public int getResult() {
		return getX()-getY();
	}
}