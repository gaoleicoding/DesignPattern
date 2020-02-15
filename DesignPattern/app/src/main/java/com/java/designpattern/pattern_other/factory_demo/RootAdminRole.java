package com.java.designpattern.pattern_other.factory_demo;

import com.java.designpattern.pattern_other.enum_demo.RoleOperation;

// 系统管理员(有A操作权限)
public class RootAdminRole implements RoleOperation {
    private String roleName;
    public RootAdminRole( String roleName ) {
        this.roleName = roleName;
    }
    @Override
    public String op() {
        return roleName + " has AAA permission";
    }
}