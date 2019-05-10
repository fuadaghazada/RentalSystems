package com.interdepartmental.repository;

import com.interdepartmental.model.CityTour;

import java.util.ArrayList;

public interface CityTourRepository {
    CityTour post(CityTour cityTour);

    ArrayList<CityTour> get();
}
