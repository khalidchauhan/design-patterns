package com.study.design.patterns.creational.builder;

public class ProductBuilder {

    private Product product;

    public ProductBuilder() {
        product = new Product();
    }

    public ProductBuilder buildPartA(String partA) {
        product.setPartA(partA);
        return this;
    }

    public ProductBuilder buildPartB(String partB) {
        product.setPartB(partB);
        return this;
    }

    public Product build() {
        return product;
    }

}
