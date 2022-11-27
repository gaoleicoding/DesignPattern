package com.java.designpattern.pattern11_observer2;

import androidx.annotation.NonNull;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {
    public String name;
    public Coder(String aName){
        name=aName;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi,"+name+",DevTechFrontier更新了，内容："+arg);

    }

    @NonNull
    @Override
    public String toString() {
        return "码农："+name;
    }
}
