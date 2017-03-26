package com.patterns.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.print("Do!");
    };
}

class EnumSingletonTest {

    EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

    public void test() {
        enumSingleton.doSomething();
    }

}

