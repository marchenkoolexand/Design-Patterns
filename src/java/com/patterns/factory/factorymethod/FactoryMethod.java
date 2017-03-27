package com.patterns.factory.factorymethod;

public class FactoryMethod {

    public static Product getProduct(String productType) {

        Product product = null;

        if (productType.equalsIgnoreCase("A")) {
            product = new ProductA();
        } else if (productType.equalsIgnoreCase("B")) {
            product = new ProductB();
        }
        return product;
    }
}
