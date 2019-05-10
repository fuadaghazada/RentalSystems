package com.interdepartmental.controller;

import com.interdepartmental.model.ParkingSpot;
import com.interdepartmental.service.ParkingSpotService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/parkingSpot")
public class ParkingSpotController {
    private ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService parkingSpotService){
        this.parkingSpotService = parkingSpotService;
    }

    @PostMapping
    public Map post(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                    @RequestBody ParkingSpot parkingSpot) {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.MANAGER;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return Collections.singletonMap("result", "UNAUTHORIZED");
        }
        parkingSpotService.post(parkingSpot);
        return Collections.singletonMap("result", "ok");
    }

    @GetMapping
    public ArrayList<ParkingSpot> get(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response) {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.ALL;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return parkingSpotService.get();
    }
}
