package com.interdepartmental.controller;

import com.interdepartmental.model.ParkingSpot;
import com.interdepartmental.service.ParkingSpotService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/parkingspot")
public class ParkingSpotController {
    private ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService parkingSpotService){
        this.parkingSpotService = parkingSpotService;
    }

    @PostMapping
    public Map post(@RequestBody ParkingSpot parkingSpot) {
        parkingSpotService.post(parkingSpot);
        return Collections.singletonMap("result", "ok");
    }

    @GetMapping
    public ParkingSpot get(@RequestParam int num) {
        return parkingSpotService.get(num);
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
