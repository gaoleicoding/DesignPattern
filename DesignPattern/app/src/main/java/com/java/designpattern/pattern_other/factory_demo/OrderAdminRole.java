package com.java.designpattern.pattern_other.factory_demo;

import com.java.designpattern.pattern_other.enum_demo.RoleOperation;

// 订单管理员(有B操作权限)
public class OrderAdminRole implements RoleOperation {
    private String roleName;
    public OrderAdminRole( String roleName ) {
        this.roleName = roleName;
    }
    @Override
    public String op() {
        return roleName + " has BBB permission";
    }
}