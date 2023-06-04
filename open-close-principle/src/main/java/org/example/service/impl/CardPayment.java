package org.example.service.impl;

import org.example.service.Payable;

public class CardPayment implements Payable {
    @Override
    public void pay() {
        //logic to pay using Card
        System.out.println("Paying using Card");
    }
}
