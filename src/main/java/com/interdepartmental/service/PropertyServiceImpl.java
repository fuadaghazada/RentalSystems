package com.interdepartmental.service;

import com.interdepartmental.model.Property;
import com.interdepartmental.model.PropertyUnit;
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

    @Override
    public ArrayList<PropertyUnit> getAvailability(String propertyName) {

        // All properties and available property units
        ArrayList<Property> properties = this.get();
        ArrayList<PropertyUnit> available_units = new ArrayList<>();

        // Finding the property with the given name
        Property property = null;
        for (Property prop : properties) {
            if (prop.getName().equals(propertyName)){
                property = prop;
                break;
            }
        }

        // If there is not such property
        if (property == null) {
            return available_units;
        }

        // Getting available property units
        for (PropertyUnit p_unit : property.getPropertyUnits()) {
            if (p_unit.isAvailable()) {
                available_units.add(p_unit);
            }
        }

        return available_units;
    }


}