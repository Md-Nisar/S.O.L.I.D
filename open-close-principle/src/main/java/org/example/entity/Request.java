package org.example.entity;

import org.example.util.Payment;

public class Request {

    private double amount;
    private Payment type;


    public Request(Payment type) {
        this.type = type;
    }

    public Payment getType() {
        return type;
    }

    public void setType(Payment type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
