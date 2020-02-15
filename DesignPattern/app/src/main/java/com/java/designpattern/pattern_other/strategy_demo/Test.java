package com.java.designpattern.pattern_other.strategy_demo;

import com.java.designpattern.pattern_other.factory_demo.JudgeRoleFactory;
import com.java.designpattern.pattern_other.factory_demo.NormalRole;
import com.java.designpattern.pattern_other.factory_demo.OrderAdminRole;
import com.java.designpattern.pattern_other.factory_demo.RootAdminRole;

public class Test{
    public static void main( String[] args ) {
        JudgeRoleStrategy judgeRole = new JudgeRoleStrategy();
        String result1 = judgeRole.judge(new RootAdminRole("ROLE_ROOT_ADMIN"));
        System.out.println( result1 );
        String result2 = judgeRole.judge(new OrderAdminRole("ROLE_ORDER_ADMIN"));
        System.out.println( result2 );
        String result3 = judgeRole.judge(new NormalRole("ROLE_NORMAL"));
        System.out.println( result3 );
    }
}