package com.patterns.singleton;

public class ClassicSingleton {

    private static ClassicSingleton singleton;

    private ClassicSingleton() {
    }

    public static synchronized ClassicSingleton getInstance() {
        if (singleton == null) {
            singleton = new ClassicSingleton();
        }
        return singleton;
    }
}
