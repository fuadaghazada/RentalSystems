package com.interdepartmental.repository;

import com.interdepartmental.model.ParkingSpot;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ParkingSpotRepositoryImpl implements ParkingSpotRepository {
    private ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();

    @Override
    public void post(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }

    @Override
    public ArrayList<ParkingSpot> get(){
        return parkingSpots;
    }

}
