package com.study.design.patterns.structural.adapter;

public class TestAdapter {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
