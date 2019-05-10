package com.interdepartmental.service;

import com.interdepartmental.model.Booking;

import java.util.ArrayList;

public interface BookingService {
    void post(Booking book);

    ArrayList<Booking> get();
}
