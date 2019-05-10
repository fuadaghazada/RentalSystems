package com.interdepartmental.service;

import com.interdepartmental.model.Booking;

import java.awt.print.Book;
import java.util.ArrayList;

public interface BookingService {
    Booking post(Booking book);
    Booking delete(String tenantName);

    ArrayList<Booking> get();

}
