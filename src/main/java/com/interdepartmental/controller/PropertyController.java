package com.interdepartmental.controller;


import com.interdepartmental.model.Property;
import com.interdepartmental.model.PropertyUnit;
import com.interdepartmental.service.PropertyService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/property")
public class PropertyController {
    private PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping
    public ArrayList<Property> get(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response) {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.ALL;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return propertyService.get();
    }

    @GetMapping
    @RequestMapping("available")
    public ArrayList<PropertyUnit> getAvailability(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                                                   @RequestParam("name") String propertyName) {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.ALL;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return propertyService.getAvailability(propertyName);
    }
}
