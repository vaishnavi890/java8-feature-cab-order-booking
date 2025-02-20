package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.repository.PaymentRepository;


public class PaymentService {
    private PaymentRepository paymentRepository = new PaymentRepository();

    public void processPayment(Payment payment) {
        paymentRepository.addPayment(payment);
    }

    public void listPayments() {
        paymentRepository.getAllPayments().forEach(payment -> System.out.println("Payment ID: " + payment.getPaymentId()));
    }

    public Payment findPaymentById(int paymentId) {
        return paymentRepository.getPaymentById(paymentId).orElse(null);
    }
}
