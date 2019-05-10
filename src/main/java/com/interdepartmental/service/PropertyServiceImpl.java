package com.interdepartmental.service;

import com.interdepartmental.model.Property;
import com.interdepartmental.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class PropertyServiceImpl implements PropertyService {
    private PropertyRepository propertyRepository;

    PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public ArrayList<Property> get() {
        String systemType = System.getProperty("spring.profiles.active");

        if (systemType == null) {
            return propertyRepository.get("apartment");
        }
        return propertyRepository.get(systemType);
    }
}