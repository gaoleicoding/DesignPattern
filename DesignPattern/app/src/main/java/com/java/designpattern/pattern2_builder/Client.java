package com.java.designpattern.pattern2_builder;

import java.io.IOException;

public class Client implements Cloneable {

    final int pingInterval;

    public Client(int pingInterval) {
        this.pingInterval = pingInterval;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Product product = new Product.Builder()
                .id(10)
                .name("phone")
                .price(100)
                .type(1)
                .build();
        System.out.println("product：" + product.toString());
    }

}