package com.interdepartmental.repository;

import com.interdepartmental.model.Booking;

import java.util.ArrayList;

public interface BookingRepository {
    ArrayList<Booking> get();

    Booking post(Booking booking);
    Booking delete(String tenantName);
}
