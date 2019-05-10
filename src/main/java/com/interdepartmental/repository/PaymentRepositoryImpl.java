package com.interdepartmental.repository;

import com.interdepartmental.model.Payment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository
{
    private ArrayList<Payment> payments = new ArrayList<>();

    @Override
    public ArrayList<Payment> get() {
        return payments;
    }

    @Override
    public void post(Payment payment) {
        payments.add(payment);
    }
}
