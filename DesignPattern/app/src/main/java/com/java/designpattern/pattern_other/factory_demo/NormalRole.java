package com.java.designpattern.pattern_other.factory_demo;

import com.java.designpattern.pattern_other.enum_demo.RoleOperation;

// 普通用户(有C操作权限)
public class NormalRole implements RoleOperation {
    private String roleName;
    public NormalRole( String roleName ) {
        this.roleName = roleName;
    }
    @Override
    public String op() {
        return roleName + " has CCC permission";
    }
}