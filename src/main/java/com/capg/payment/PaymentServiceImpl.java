package com.capg.payment;

import org.springframework.stereotype.Component;

@Component("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void doPayment() {
        System.out.println("do your payment...");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit amount in process...");
    }
}
