package com.interdepartmental.service;

import com.interdepartmental.model.Payment;
import com.interdepartmental.model.Rent;
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
    public Payment post(Payment payment) {
        String systemType = System.getProperty("spring.profiles.active");

        if (systemType == null) {
            return paymentRepository.post("apartment", payment);
        }

        return paymentRepository.post(systemType, payment);
    }

    @Override
    public ArrayList<Payment> get() {
        String systemType = System.getProperty("spring.profiles.active");

        if (systemType == null) {
            return paymentRepository.get("apartment");
        }

        return paymentRepository.get(systemType);
    }
}
