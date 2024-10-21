package com.study.design.patterns.creational.factory;

public class TestFactory {

    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        creatorA.factoryMethod().use();

        creatorB.factoryMethod().use();
    }
}
