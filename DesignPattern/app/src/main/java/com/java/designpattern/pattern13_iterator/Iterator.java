package com.java.designpattern.pattern13_iterator;

//抽象迭代器
interface Iterator
{
    Object first();
    Object next();
    boolean hasNext();
}