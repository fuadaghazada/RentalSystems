package com.interdepartmental.repository;

import com.interdepartmental.model.Rent;

import java.util.ArrayList;

public interface RentRepository {
    String post(Rent rent);

    ArrayList<Rent> get();
}
