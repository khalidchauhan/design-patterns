package com.study.design.patterns.creational.builder;

public class TestBuilder {

    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .buildPartA("A")
                .buildPartB("B")
                .build();

        System.out.println(product);
    }
}
