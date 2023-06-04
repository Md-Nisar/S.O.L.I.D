package org.example.service.impl;

import org.example.service.Payable;

public class PayPalPayment implements Payable {
    @Override
    public void pay() {
        //logic to pay using PayPal
        System.out.println("Paying using PayPal");

    }
}
