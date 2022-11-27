package com.java.designpattern.pattern16_mediator;

public interface QQ {
    void setMessage(User from,User to,String msg);
    void addUser(User user);
    void setAllMessage(User from,String msg);
}
