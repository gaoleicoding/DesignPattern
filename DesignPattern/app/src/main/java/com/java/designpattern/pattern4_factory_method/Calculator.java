package com.java.designpattern.pattern4_factory_method;

public class Calculator {

    public static String calculate(int num1, int num2, String sign) {
        if (sign.endsWith("+")) {
            return num1 + num2 + "";
        }
        if (sign.endsWith("-")) {
            return num1 - num2 + "";
        }
        if (sign.endsWith("*")) {
            return num1 * num2 + "";
        }
        if (sign.endsWith("/")) {
            return num1 / num2 + "";
        }
        return "出错了";
    }
}
