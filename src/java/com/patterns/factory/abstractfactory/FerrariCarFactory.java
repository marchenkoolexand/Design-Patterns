package com.patterns.factory.abstractfactory;

public class FerrariCarFactory extends CarFactory {

    @Override
    public Sedan createSedan() {
        return new FerrariSedan();
    }

    @Override
    public Pickup createPickup() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Truck createTruck() {
        throw new UnsupportedOperationException();
    }
}
