package com.study.design.patterns.behavioral.strategy;

public class ConcreteStrategyAdd implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
