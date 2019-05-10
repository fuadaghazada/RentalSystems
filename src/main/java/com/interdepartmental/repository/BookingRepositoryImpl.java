package com.interdepartmental.repository;

import com.interdepartmental.model.Booking;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BookingRepositoryImpl implements BookingRepository {
    private ArrayList<Booking> bookings = new ArrayList<>();

    @Override
    public ArrayList<Booking> get() {
        return bookings;
    }

    @Override
    public void post(Booking booking) {
        bookings.add(booking);
    }
}
