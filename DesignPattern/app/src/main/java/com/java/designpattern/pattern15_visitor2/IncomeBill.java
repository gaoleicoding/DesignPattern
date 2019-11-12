package com.java.designpattern.pattern15_visitor2;

//收入单子
public class IncomeBill implements Bill{
 
    private double amount;
 
    private String item;
 
    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }
 
    public void accept(Visitor viewer) {
        viewer.visit(this);
    }
 
    public double getAmount() {
        return amount;
    }
 
    public String getItem() {
        return item;
    }
 
}