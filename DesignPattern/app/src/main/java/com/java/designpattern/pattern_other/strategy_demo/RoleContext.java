package com.java.designpattern.pattern_other.strategy_demo;

import com.java.designpattern.pattern_other.enum_demo.RoleOperation;

public class RoleContext {
    // 可更换的策略，传入不同的策略对象，业务即相应变化
    private RoleOperation operation;
    public RoleContext( RoleOperation operation ) {
        this.operation = operation;
    }
    public String execute() {
        return operation.op();
    }
}