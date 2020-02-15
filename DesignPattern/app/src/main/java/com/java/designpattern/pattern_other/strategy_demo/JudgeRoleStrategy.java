package com.java.designpattern.pattern_other.strategy_demo;

import com.java.designpattern.pattern_other.enum_demo.RoleOperation;

public class JudgeRoleStrategy {
    public String judge( RoleOperation roleOperation ) {
        RoleContext roleContext = new RoleContext( roleOperation );
        return roleContext.execute();
    }
}
