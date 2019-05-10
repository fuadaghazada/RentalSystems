package com.interdepartmental.controller;

import com.interdepartmental.model.Announcement;
import com.interdepartmental.model.Rent;
import com.interdepartmental.service.RentService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/rent")
public class RentController {
    private RentService rentService;

    public RentController(RentService rentService){
        this.rentService = rentService;
    }

    @PostMapping
    public Map post(@RequestBody Rent rent) {
        String message = rentService.post(rent);
        return Collections.singletonMap("result", message);
    }

    @GetMapping
    public ArrayList<Rent> get() {
        return rentService.get();
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
