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
    public Booking post(Booking booking) {
        bookings.add(booking);
        return booking;
    }

    @Override
    public Booking delete(String tenantName) {
        // Finding the booking with the given tenant name
        Booking removedBooking = null;

        for (Booking book: bookings) {
            if (book.getTenant().getName().equals(tenantName)) {
                removedBooking = book;
                break;
            }
        }

        // Deleting the booking
        if (removedBooking != null){
            bookings.remove(removedBooking);
        }

        return removedBooking;
    }
}
