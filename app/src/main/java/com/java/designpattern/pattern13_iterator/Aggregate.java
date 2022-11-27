package com.java.designpattern.pattern13_iterator;

//抽象聚合
interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator iterator();
}