package com.interdepartmental.model;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;


public class ObserverConfig {

    private PropertyManager propertyManager = new PropertyManager();

    @Autowired
    public ObserverConfig(ApplicationContext context) {
//        context.getBean(Booking.class).registerObserver(propertyManager);
    }
}
