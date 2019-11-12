package com.java.designpattern.pattern15_visitor2;

//单个单子的接口（相当于Element）
public interface Bill {
 
    void accept(Visitor viewer);
 
}