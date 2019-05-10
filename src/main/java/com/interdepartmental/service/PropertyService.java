package com.interdepartmental.service;

import com.interdepartmental.model.Property;
import com.interdepartmental.model.PropertyUnit;

import java.util.ArrayList;

public interface PropertyService {
    ArrayList<Property> get();

    ArrayList<PropertyUnit> getAvailability(String propertyName);
}
