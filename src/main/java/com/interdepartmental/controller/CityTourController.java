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
    public Map post(@RequestBody CityTour cityTour) {
        cityTourService.post(cityTour);
        return Collections.singletonMap("result", "ok");
    }

    @GetMapping
    public CityTour get(@RequestParam String topic) {
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
