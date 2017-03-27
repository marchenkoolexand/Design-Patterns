package com.patterns.decorator;

public class RegularExtra extends Extra {

    public RegularExtra(String label, Double price, Order order) {
        super(order, label, price);
    }

    @Override
    public double getPrice() {
        return this.price + order.getPrice();
    }

}
