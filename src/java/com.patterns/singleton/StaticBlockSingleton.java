package com.patterns.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton staticBlockSingleton = null;

    static {
        staticBlockSingleton = new StaticBlockSingleton();
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance() {
        return staticBlockSingleton;
    }
}
