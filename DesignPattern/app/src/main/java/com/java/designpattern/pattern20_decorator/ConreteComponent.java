package com.java.designpattern.pattern20_decorator;

public class ConreteComponent extends Component{
    @Override
    public void operate() {
        System.out.println("开始干大事了...");
    }
}
