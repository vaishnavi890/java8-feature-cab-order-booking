package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.service.PaymentService;

public class PaymentController {
    private PaymentService paymentService = new PaymentService();

    public void processPayment(Payment payment) {
        paymentService.processPayment(payment);
    }

    public void displayPayments() {
        paymentService.listPayments();
    }

    public Payment getPaymentById(int paymentId) {
        return paymentService.findPaymentById(paymentId);
    }
}

