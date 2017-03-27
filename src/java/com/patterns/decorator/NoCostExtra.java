package com.patterns.decorator;

public class NoCostExtra extends Extra {

    public NoCostExtra(String label, Order order) {
        super(order, label, 0.0);
    }

    @Override
    public double getPrice() {
        return order.getPrice();
    }
}
