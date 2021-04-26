package com.java.designpattern.pattern4_factory_method;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Operation operation = CalculatorFactory.creatOperation(OperationAdd.class);

        operation.setX(1);
        operation.setY(2);

        int result = operation.getResult();
    }
}