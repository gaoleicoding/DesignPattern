package com.java.designpattern.pattern14_template;

public class MilitaryComputer extends AbstractComputer {
    protected void checkHardWare() {
        super.checkHardWare();
        System.out.println("检查硬件防火墙");
    }

    protected void login() {
        System.out.println("进行指纹识别用户验证");
    }

}
