package com.interdepartmental.repository;

import com.interdepartmental.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PropertyRepositoryImpl implements PropertyRepository{

    private ArrayList<Property> apartments = new ArrayList<Property>(){{
        add(new Apartment("Lakeside", "It is near the lake", "Lake street", "Lake district", "06700", "apartment", new ArrayList<PropertyUnit>(){{
            add(new PropertyUnit("3", 1, "This is a mediocre flat", 800.45f, true));
        }}, "106", "107"));
        // **********
        add(new Apartment("Mountainside", "It is near the mountain", "Mountain street", "Mountain district", "06800", "apartment", new ArrayList<PropertyUnit>(){{
            add(new PropertyUnit("1", 2, "This is a good flat", 1000.45f, true));
        }}, "108", "109"));
        // **********
        add(new Apartment("Seaside", "It is near the sea", "Sea street", "Sea district", "06900", "apartment", new ArrayList<PropertyUnit>(){{
            add(new PropertyUnit("41", 3, "This is a bad flat", 500.45f, true));
        }}, "110", "111"));

    }};

    private ArrayList<Property> hotels = new ArrayList<Property>(){{
        add(new Hotel("Luxury hotel", "It is very luxurious", "Luxury street", "Luxury district", "07700", "hotel", new ArrayList<PropertyUnit>(){{
            add(new PropertyUnit());
        }}, true));
        // **********
        add(new Hotel("Less Luxury hotel", "It is a bit less luxurious", "Less Luxury street", "Less Luxury district", "07800", "hotel", new ArrayList<PropertyUnit>(){{
            add(new PropertyUnit());
        }}, false));
        // **********
        add(new Hotel("More Luxury hotel", "It is more luxurious", "More Luxury street", "More Luxury district", "08800", "hotel", new ArrayList<PropertyUnit>(){{
            add(new PropertyUnit());
        }}, true));
    }};

    private ArrayList<Property> dormitories = new ArrayList<Property>(){{
        add(new Dormitory("60", "No comment 1", "Upper street", "Upper district", "06800", "dorm", new ArrayList<PropertyUnit>(){{
            add(new PropertyUnit());
        }}, new ArrayList<Tenant>(){{
            add(new Tenant());
        }}));
        // **********
        add(new Dormitory("77", "No comment 2", "Down street", "Down district", "06800", "dorm", new ArrayList<PropertyUnit>(){{
            add(new PropertyUnit());
        }}, new ArrayList<Tenant>(){{
            add(new Tenant());
        }}));
        // **********
        add(new Dormitory("78", "No comment 3", "Down street", "Down district", "06800", "dorm", new ArrayList<PropertyUnit>(){{
            add(new PropertyUnit());
        }}, new ArrayList<Tenant>(){{
            add(new Tenant());
        }}));
    }};

    @Override
    public ArrayList<Property> get(String systemType) {

        if (systemType.equals("apartment")) {
            return apartments;
        }
        else if(systemType.equals("hotel")) {
            return hotels;
        }
        else {
            return dormitories;
        }
    }
}
