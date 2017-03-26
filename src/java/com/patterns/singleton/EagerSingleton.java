package com.patterns.singleton;

public class EagerSingleton {

    private final static EagerSingleton SINGLETON = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return SINGLETON;
    }
}
