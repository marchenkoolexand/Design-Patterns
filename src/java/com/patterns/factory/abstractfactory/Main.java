package com.patterns.factory.abstractfactory;

public class Main {

    static CarFactory carFactory = new FordCarFactory();

    public static void main(String[] args) {
        Pickup pickup = carFactory.createPickup();
        Sedan sedan = carFactory.createSedan();
        Truck truck = carFactory.createTruck();

        carFactory = new FerrariCarFactory();

        sedan = carFactory.createSedan();
        pickup = carFactory.createPickup();

    }

}
