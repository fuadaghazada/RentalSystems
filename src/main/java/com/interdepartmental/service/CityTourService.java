package com.interdepartmental.service;

import com.interdepartmental.model.CityTour;

public interface CityTourService {
    CityTour post(CityTour cityTour);

    CityTour get(String topic);
}
