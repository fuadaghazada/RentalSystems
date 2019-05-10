package com.interdepartmental.service;

import com.interdepartmental.model.CityTour;
import com.interdepartmental.repository.CityTourRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CityTourServiceImpl implements CityTourService {
    private CityTourRepository cityTourRepository;

    public CityTourServiceImpl(CityTourRepository cityTourRepository){
        this.cityTourRepository = cityTourRepository;
    }

    @Override
    public CityTour post(CityTour cityTour){
        return cityTourRepository.post(cityTour);
    }

    @Override
    public CityTour get(String topic){
        for(CityTour cityTour : cityTourRepository.get()){
            if(cityTour.getStartLocation().equals(topic)){
                return cityTour;
            }
        }
        return null;
    }
}
