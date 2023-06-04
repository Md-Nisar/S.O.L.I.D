package org.example.service.impl;

import org.example.service.Payable;

public class ChequePayment implements Payable {
    @Override
    public void pay() {
        // Logic to pay using Cheque
        System.out.println("Paying using cheque");
    }
}
