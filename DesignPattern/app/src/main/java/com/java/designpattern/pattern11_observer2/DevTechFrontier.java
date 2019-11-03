package com.java.designpattern.pattern11_observer2;

import com.java.designpattern.pattern11_observer.Observer;

import java.util.Observable;

public class DevTechFrontier extends Observable {
    public void postNewPublication(String content){
        setChanged();
        notifyObservers(content);
    }
}
