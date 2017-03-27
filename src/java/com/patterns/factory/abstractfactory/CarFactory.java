package com.patterns.factory.abstractfactory;

public abstract class CarFactory {

    public abstract Sedan createSedan();

    public abstract Pickup createPickup();

    public abstract Truck createTruck();
}
