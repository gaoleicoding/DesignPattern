package com.java.designpattern.pattern16_mediator;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        QQMediator manager = new QQMediator();
        manager.addUser(a);
        manager.addUser(b);
        manager.addUser(c);
        manager.addUser(d);

        manager.setMessage(a,b,"你好");
        manager.setMessage(d,a,"干嘛呢？");
        manager.setAllMessage(a,"大家上班啦！");
    }
}
