package com.interdepartmental.service;

import com.interdepartmental.model.Payment;

import java.util.ArrayList;

public interface PaymentService {
    void post(Payment payment);

    ArrayList<Payment> get();
}
