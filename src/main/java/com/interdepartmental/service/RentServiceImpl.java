package com.interdepartmental.service;

import com.interdepartmental.model.Rent;
import com.interdepartmental.repository.RentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RentServiceImpl implements RentService {
    RentRepository rentRepository;

    public RentServiceImpl(RentRepository rentRepository){
        this.rentRepository = rentRepository;
    }

    @Override
    public String post(Rent rent){
        return rentRepository.post(rent);
    }

    @Override
    public ArrayList<Rent> get(){
        return rentRepository.get();
    }
}
