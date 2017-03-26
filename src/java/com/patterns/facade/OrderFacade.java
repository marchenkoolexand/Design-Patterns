package com.patterns.facade;

public class OrderFacade {

    Storage storage = new Storage();
    Payment payment = new Payment();
    Order order;

    public void makeOrder(int itemId) {
        order = new Order(1212);
        boolean avaible = storage.checkIfAvaible(itemId);
        if (avaible) {
            boolean enoughMoney = payment.checkIfEnoughMoney(new Client());
            if (enoughMoney) {
                boolean paymentResult = payment.makePayment();
                if (paymentResult) {
                    storage.sendOrder(order.getOrderNum(), new Adress());
                }
            }
        }
    }

    public void cancelOrder(Order order){
        storage.addItemToStorage(order.getOrderNum());
        payment.returnMoney(new Client());
    }

}
