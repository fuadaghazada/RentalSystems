package com.interdepartmental.repository;

import com.interdepartmental.model.Payment;
import com.interdepartmental.model.Rent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository
{
    private ArrayList<Payment> payments_apartment = new ArrayList<>();
    private ArrayList<Payment> payments_hotel = new ArrayList<>();
    private ArrayList<Payment> payments_dormitory = new ArrayList<>();


    @Override
    public ArrayList<Payment> get(String systemType) {

        if (systemType.equals("apartment")) {
            return payments_apartment;
        }
        else if(systemType.equals("hotel")) {
            return payments_hotel;
        }
        else {
            return payments_dormitory;
        }
    }

    @Override
    public Payment post(String systemType, Payment payment) {

        if (systemType.equals("apartment")) {
            payments_apartment.add(payment);
        }
        else if(systemType.equals("hotel")) {
            payments_hotel.add(payment);
        }
        else {
            payments_dormitory.add(payment);
        }

        return payment;
    }
}
