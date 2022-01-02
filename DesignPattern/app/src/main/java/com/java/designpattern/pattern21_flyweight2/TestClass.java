package com.java.designpattern.pattern21_flyweight2;

import androidx.core.util.Pools;

public class TestClass {

    public String name = "TestClass";


    private static final Pools.SynchronizedPool<TestClass> sPool = new Pools.SynchronizedPool<>(10);//对象池

    //获取对象中数据
    public static TestClass obtain() {
        TestClass acquire = sPool.acquire();
        if (acquire == null) {
            return new TestClass();
        }
        return acquire;
    }

    //清空对象
    public void recycle() {
        sPool.release(this);
    }

}