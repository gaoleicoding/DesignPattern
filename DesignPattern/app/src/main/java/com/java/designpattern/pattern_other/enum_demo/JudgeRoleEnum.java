package com.java.designpattern.pattern_other.enum_demo;

public class JudgeRoleEnum {
    public String judge( String roleName ) {
        // 一行代码搞定！之前的if/else没了！
        return RoleEnum.valueOf(roleName).op();
    }
}