package com.patterns.decorator;

public class Pizza implements Order {

    private String label;
    private Double price;

    public Pizza(String label, Double price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getLabel() {
        return this.label;
    }


}
