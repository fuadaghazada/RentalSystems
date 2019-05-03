package com.interdepartmental.repository;

import com.interdepartmental.model.ParkingSpot;

import java.util.ArrayList;

public interface ParkingSpotRepository {
    void post(ParkingSpot parkingSpot);

    ArrayList<ParkingSpot> get();
}
