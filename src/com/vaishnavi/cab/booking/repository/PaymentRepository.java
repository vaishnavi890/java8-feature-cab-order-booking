package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Payment;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class PaymentRepository {
    private List<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public List<Payment> getAllPayments() {
        return payments;
    }

    public Optional<Payment> getPaymentById(int paymentId) {
        return payments.stream().filter(payment -> payment.getPaymentId() == paymentId).findFirst();
    }
}
