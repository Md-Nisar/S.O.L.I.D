package org.example.service.impl;

import org.example.service.Payable;

public class CashPayment implements Payable {
    @Override
    public void pay() {
        //logic to pay using Cash
        System.out.println("Paying using Cash");
    }
}
