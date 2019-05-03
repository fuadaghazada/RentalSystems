package com.interdepartmental.service;

import com.interdepartmental.model.ParkingSpot;

public interface ParkingSpotService {
    void post(ParkingSpot parkingSpot);

    ParkingSpot get(int num);
}
