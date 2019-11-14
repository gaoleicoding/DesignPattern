package com.java.designpattern.pattern21_flyweight;

/**
 * 享元类
 * @author 波波烤鸭
 * @email dengpbs@163.com
 *
 */
public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}