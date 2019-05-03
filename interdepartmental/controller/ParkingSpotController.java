package com.interdepartmental.controller;

import com.interdepartmental.model.ParkingSpot;
import com.interdepartmental.service.ParkingSpotService;
import org.springframework.web.bind.annotation.*;

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
}
