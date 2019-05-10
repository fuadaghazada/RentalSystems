package com.interdepartmental.model;

public class ObserverConfig {

    private PropertyManager propertyManager = new PropertyManager();
    private Booking booking = new Booking();

    public ObserverConfig() {
        booking.registerObserver(propertyManager);
        booking.notifyObserver();
    }
}
