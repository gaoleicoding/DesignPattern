package com.java.designpattern.pattern_other.factory_demo;

import com.java.designpattern.pattern_other.strategy_demo.JudgeRoleStrategy;

public class Test {
    public static void main( String[] args ) {
        JudgeRoleFactory judgeRole = new JudgeRoleFactory();
        String result1 = judgeRole.judge("ROLE_ROOT_ADMIN");
        System.out.println( result1 );
        String result2 = judgeRole.judge("ROLE_ORDER_ADMIN");
        System.out.println( result2 );
        String result3 = judgeRole.judge("ROLE_NORMAL");
        System.out.println( result3 );
    }
}