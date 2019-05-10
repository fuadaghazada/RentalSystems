package com.interdepartmental.controller;

import com.interdepartmental.model.CityTour;
import com.interdepartmental.service.CityTourService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/citytour")
public class CityTourController {
    private CityTourService cityTourService;

    public CityTourController(CityTourService cityTourService){
        this.cityTourService = cityTourService;
    }

    @PostMapping
    public CityTour post(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                         @RequestBody CityTour cityTour) {
        return cityTourService.post(cityTour);
    }

    @GetMapping
    public CityTour get(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                        @RequestParam String topic) {
        return cityTourService.get(topic);
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
