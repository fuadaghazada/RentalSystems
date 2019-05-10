package com.interdepartmental.repository;

import com.interdepartmental.model.Payment;

import java.util.ArrayList;

public interface PaymentRepository {
    ArrayList<Payment> get(String systemType);

    Payment post(String systemType, Payment payment);
}
