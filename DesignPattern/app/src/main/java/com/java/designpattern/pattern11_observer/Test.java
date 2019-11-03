package com.java.designpattern.pattern11_observer;

public class Test {
    
    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        
        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");
        
        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");
        
        System.out.println("\n---------------------del一个observer后-------------------------\n");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");
        
    }
}