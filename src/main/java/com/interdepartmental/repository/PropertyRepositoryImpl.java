package com.interdepartmental.repository;

import com.interdepartmental.model.Property;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PropertyRepositoryImpl implements PropertyRepository{
    private ArrayList<Property> properties = new ArrayList<>();

    @Override
    public ArrayList<Property> get() {
        return properties;
    }
}
