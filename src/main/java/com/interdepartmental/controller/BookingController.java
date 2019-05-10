package com.interdepartmental.controller;

import com.interdepartmental.model.Booking;
import com.interdepartmental.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/booking")
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService)
    {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Map post(@RequestBody Booking booking)
    {
        bookingService.post(booking);
        return Collections.singletonMap("result", "ok");
    }

    @GetMapping
    public ArrayList<Booking> get()
    {
        return bookingService.get();
    }
}
