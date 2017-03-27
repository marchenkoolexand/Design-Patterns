package com.patterns.factory.abstractfactory;

public class FordCarFactory extends CarFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Pickup createPickup() {
        return new FordPickup();
    }

    @Override
    public Truck createTruck() {
        return new FordTruck();
    }
}
