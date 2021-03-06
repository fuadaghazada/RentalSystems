package com.interdepartmental.controller;

import com.interdepartmental.model.ParkingSpot;
import com.interdepartmental.service.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/parkingSpot")
public class ParkingSpotController {
    private ParkingSpotService parkingSpotService;
    @Autowired
    private FeatureFlagController flag;

    public ParkingSpotController(ParkingSpotService parkingSpotService){
        this.parkingSpotService = parkingSpotService;
    }

    @PostMapping
    public Map post(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                    @RequestBody ParkingSpot parkingSpot) {
        if(!flag.checkFeatureFlag("assingParking")){
            response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
            return Collections.singletonMap("result", "METHOD NOT ALLOWED");
        }
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
        if(!flag.checkFeatureFlag("listParking")){
            response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
            return null;
        }
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.ALL;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return parkingSpotService.get();
    }
}
