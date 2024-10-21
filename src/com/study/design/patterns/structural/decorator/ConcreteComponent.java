package com.study.design.patterns.structural.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent Operation");
    }
}
