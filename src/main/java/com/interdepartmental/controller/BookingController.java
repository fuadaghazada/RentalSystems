package com.interdepartmental.controller;

import com.interdepartmental.model.Booking;
import com.interdepartmental.service.BookingService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
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

    @GetMapping
    @RequestMapping("auth")
    public boolean auth(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response) {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.MANAGER;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }
        return true;
    }
}
