package com.patterns.decorator;

public class DoubleExtra extends Extra {

    public DoubleExtra(String label, Double price, Order order) {
        super(order, label, price);
    }

    @Override
    public double getPrice() {
        return (this.price * 2) + order.getPrice();
    }

    @Override
    public String getLabel() {
        return order.getLabel() + ". Double " + this.label;
    }
}
