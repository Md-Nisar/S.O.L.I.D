package org.example.service;

import org.example.entity.Request;
import org.example.util.PaymentFactory;

/**
 * 2. OPEN-CLOSED: An entity must be open for extension and closed for modification.
 *    The main goal is not to break the core of the system.
 * */
public class PaymentService {

    public void pay(Request request) {
        Payable payable = PaymentFactory.initialize(request);
        payable.pay();
    }
}
