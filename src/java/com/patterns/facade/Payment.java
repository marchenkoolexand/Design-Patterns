package com.patterns.facade;

public class Payment {

    public boolean checkIfEnoughMoney(Client client) {
        return true;
    }

    public boolean makePayment() {
        return true;
    }

    public boolean returnMoney(Client client) {
        return true;
    }

}
