package com.interdepartmental.service;

import com.interdepartmental.model.Payment;
import com.interdepartmental.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PaymentServiceImpl implements PaymentService {
    private PaymentRepository paymentRepository;

    PaymentServiceImpl(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void post(Payment payment) {
        paymentRepository.post(payment);
    }

    @Override
    public ArrayList<Payment> get() {
        return paymentRepository.get();
    }
}
