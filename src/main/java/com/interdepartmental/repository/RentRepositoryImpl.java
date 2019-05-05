package com.interdepartmental.repository;

import com.interdepartmental.model.Payment;
import com.interdepartmental.model.Rent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RentRepositoryImpl implements RentRepository {
    private ArrayList<Rent> rents = new ArrayList<>();

    @Override
    public String post(Rent rent){
        rents.add(rent);
        return rent.getPayer() + " has paid " + rent.getAmount() + " TL for his rent.";
    }

    @Override
    public ArrayList<Rent> get(){
        return rents;
    }
}
