package com.interdepartmental.service;

import com.interdepartmental.model.Rent;

import java.util.ArrayList;

public interface RentService {
    String post(Rent rent);

    ArrayList<Rent> get();
}
