package com.interdepartmental.controller;

import com.interdepartmental.model.Booking;
import com.interdepartmental.service.BookingService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


@RestController
@RequestMapping("api/v1/booking")
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService)
    {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking post(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                     @RequestBody Booking booking)
    {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.TENANT;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        // Adding Book and returning it
        return bookingService.post(booking);
    }

    @DeleteMapping
    public Booking leaveProperty(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                                 @RequestParam("tenantName") String tenantName)
    {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.TENANT;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        // Removing the book
        return bookingService.delete(tenantName);
    }


    @GetMapping
    public ArrayList<Booking> get(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response)
    {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.MANAGER;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }

        return bookingService.get();
    }
}
