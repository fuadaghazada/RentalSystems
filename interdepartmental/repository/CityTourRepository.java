package com.interdepartmental.repository;

import com.interdepartmental.model.CityTour;

import java.util.ArrayList;

public interface CityTourRepository {
    void post(CityTour cityTour);

    ArrayList<CityTour> get();
}
