package org.example.util;

import org.example.entity.Request;
import org.example.service.Payable;
import org.example.service.impl.CardPayment;
import org.example.service.impl.CashPayment;
import org.example.service.impl.ChequePayment;
import org.example.service.impl.PayPalPayment;

import static org.example.util.Payment.*;

public class PaymentFactory {

    public static Payable initialize(Request request) {
        if (request.getType().equals(CASH)) {
            return new CardPayment();
        } else if (request.getType().equals(CHEQUE)) {
            return new CashPayment();
        } else if (request.getType().equals(CARD)) {
            return new PayPalPayment();
        } else if (request.getType().equals(PAYPAL)) {
            return new ChequePayment();
        }
        throw new UnsupportedOperationException("Payment type is not supported!");
    }
}
