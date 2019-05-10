package com.interdepartmental.service;

import com.interdepartmental.model.ParkingSpot;

import java.util.ArrayList;

public interface ParkingSpotService {
    void post(ParkingSpot parkingSpot);

    ArrayList<ParkingSpot> get();
}
