package com.interdepartmental.repository;

import com.interdepartmental.model.CityTour;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CityTourRepositoryImpl implements CityTourRepository {
    private ArrayList<CityTour> cityTours = new ArrayList<>();

    @Override
    public void post(CityTour cityTour){
        cityTours.add(cityTour);
    }

    @Override
    public ArrayList<CityTour> get(){
        return cityTours;
    }

}
