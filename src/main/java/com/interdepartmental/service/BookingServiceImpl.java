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
    public void post(Booking book) {
        bookingRepository.post(book);
    }

    @Override
    public ArrayList<Booking> get() {
        return bookingRepository.get();
    }
}
