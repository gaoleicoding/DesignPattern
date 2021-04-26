package com.java.designpattern.pattern4_factory_method;

class CalculatorFactory {
    static <T extends Operation> T creatOperation(Class<T> clz) {
        T operation = null;
        try {
            operation = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {

        }
        return operation;
    }
}