package com.study.design.patterns.creational.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        if (firstInstance == secondInstance) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
