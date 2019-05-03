package com.interdepartmental.service;

import com.interdepartmental.model.CityTour;

public interface CityTourService {
    void post(CityTour cityTour);

    CityTour get(String topic);
}
