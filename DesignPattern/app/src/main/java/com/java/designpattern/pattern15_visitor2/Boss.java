package com.java.designpattern.pattern15_visitor2;

//老板类，查看账本的类之一
public class Boss implements Visitor {
 
    private double totalIncome;
 
    private double totalConsume;
 
    //老板只关注一共花了多少钱以及一共收入多少钱，其余并不关心
    public void visit(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }
 
    public void visit(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }
 
    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }
 
    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }
 
}