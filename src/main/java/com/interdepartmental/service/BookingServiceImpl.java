package com.interdepartmental.service;

import com.interdepartmental.model.Booking;
import com.interdepartmental.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking post(Booking book) {
        return bookingRepository.post(book);
    }

    @Override
    public Booking delete(String tenantName) {
        return bookingRepository.delete(tenantName);
    }

    @Override
    public ArrayList<Booking> get() {
        return bookingRepository.get();
    }
}
