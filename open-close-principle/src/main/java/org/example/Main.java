package org.example;

import org.example.entity.Request;
import org.example.service.PaymentService;
import org.example.util.Payment;

public class Main {
    public static void main(String[] args) {

        Request request = new Request(Payment.CARD);
        PaymentService paymentService = new PaymentService();
        paymentService.pay(request);
    }
}