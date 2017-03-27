package com.patterns.decorator;

public abstract class Extra implements Order {

    protected Order order;
    protected String label;
    protected Double price;

    public Extra(Order order, String label, Double price) {
        this.order = order;
        this.label = label;
        this.price = price;
    }

    public abstract double getPrice();

    @Override
    public String getLabel() {
        return order.getLabel() + ". " + this.label;
    }
}
