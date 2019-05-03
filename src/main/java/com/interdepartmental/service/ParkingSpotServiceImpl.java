package com.interdepartmental.service;

import com.interdepartmental.model.ParkingSpot;
import com.interdepartmental.repository.ParkingSpotRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotServiceImpl(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Override
    public void post(ParkingSpot parkingSpot){
        parkingSpotRepository.post(parkingSpot);
    }

    @Override
    public ParkingSpot get(int num){
        for(ParkingSpot parkingSpot : parkingSpotRepository.get()){
            if(parkingSpot.getSpotNum() == num){
                return parkingSpot;
            }
        }
        return null;
    }
}
