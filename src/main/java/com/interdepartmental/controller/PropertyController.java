package com.interdepartmental.controller;


import com.interdepartmental.model.Property;
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
    public ArrayList<Property> get() { return propertyService.get(); }

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
