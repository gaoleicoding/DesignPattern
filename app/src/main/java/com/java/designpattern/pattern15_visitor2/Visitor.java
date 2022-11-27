package com.java.designpattern.pattern15_visitor2;

//账单查看者接口（相当于Visitor）
public interface Visitor {
 
    //查看消费的单子
    void visit(ConsumeBill bill);
 
    //查看收入的单子
    void visit(IncomeBill bill);
 
}