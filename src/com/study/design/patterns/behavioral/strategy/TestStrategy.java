package com.study.design.patterns.behavioral.strategy;

public class TestStrategy {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyAdd();

        Context context = new Context();
        context.setStrategy(strategy);

        System.out.println(context.executeStrategy(1, 2));
    }
}
