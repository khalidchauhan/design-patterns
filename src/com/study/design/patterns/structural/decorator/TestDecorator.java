package com.study.design.patterns.structural.decorator;

public class TestDecorator {

    public static void main(String[] args) {
        Component instance = new ConcreteComponent();
        Component component = new ConcreteDecorator(instance);

        component.operation();
    }
}
