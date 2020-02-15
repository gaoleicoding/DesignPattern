package com.java.designpattern.pattern_other.factory_demo;

public class JudgeRoleFactory {
    public String judge( String roleName ) {
        // 一行代码搞定！之前的 if/else也没了！
        return RoleFactory.getOp(roleName).op();
    }
}