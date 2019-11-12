package com.java.designpattern.pattern11_observer2;


public class Client {
    
    public static void main(String[] args) {
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        
        Coder userZhang = new Coder("ZhangSan");
        Coder userLi = new Coder("LiSi");
        Coder userWang = new Coder("WangWu");

        devTechFrontier.addObserver(userZhang);
        devTechFrontier.addObserver(userLi);
        devTechFrontier.addObserver(userWang);
        devTechFrontier.postNewPublication("新一期的开发技术前线发布了...");
        
        System.out.println("\n----------------------del一个observer后------------------------\n");
        devTechFrontier.deleteObserver(userZhang);
        devTechFrontier.postNewPublication("新一期的开发技术前线发布了...");
        
    }
}