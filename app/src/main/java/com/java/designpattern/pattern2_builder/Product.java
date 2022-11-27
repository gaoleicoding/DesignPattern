package com.java.designpattern.pattern2_builder;

public class Product {
    final int id;
    final String name;
    final int type;
    final float price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.price = builder.price;
    }

    public static class Builder {
        private int id;
        private String name;
        private int type;
        private float price;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(int type) {
            this.type = type;
            return this;
        }

        public Builder price(float price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}