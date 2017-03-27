package com.patterns.factory.abstractfactory;

public class FordSedan extends Sedan {

    public FordSedan() {
        start();
        drive();
        stop();
    }

    @Override
    public void start() {
        System.out.println(this.getClass() + "Start");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + "Stop");
    }

    @Override
    public void drive() {
        System.out.println(this.getClass() + "Drive");
    }
}
