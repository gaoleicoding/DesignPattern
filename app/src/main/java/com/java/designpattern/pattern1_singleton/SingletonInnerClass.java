package com.java.designpattern.pattern1_singleton;

import android.content.Context;
import android.widget.Toast;

/**
 * 懒汉模式
 */
public class SingletonInnerClass {

    private SingletonInnerClass() {
    }

    private static class SingletonHolder {
        private static final SingletonInnerClass instance = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return SingletonHolder.instance;
    }

    public void toast(Context context){
        Toast.makeText(context,"这是一个单例模式",Toast.LENGTH_SHORT).show();
    }
}
