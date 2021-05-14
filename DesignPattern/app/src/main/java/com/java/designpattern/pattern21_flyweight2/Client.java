package com.java.designpattern.pattern21_flyweight2;

import android.util.Log;

import com.java.designpattern.pattern21_flyweight.ChessFlyWeight;
import com.java.designpattern.pattern21_flyweight.ChessFlyWeightFactory;
import com.java.designpattern.pattern21_flyweight.Coordinate;

public class Client {

    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        System.out.println("name: " + testClass.name);
        testClass.name = "new name";
        testClass.recycle();// 回收起来备用
        TestClass obtain = TestClass.obtain();
        System.out.println("name: " + obtain.name);
        TestClass obtain1 = TestClass.obtain();
        System.out.println("name: " + obtain1.name);

    }
}