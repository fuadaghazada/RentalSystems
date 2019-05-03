package com.interdepartmental.controller;


import com.interdepartmental.model.Property;
import com.interdepartmental.service.PropertyService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/property")
public class PropertyController {
    private PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @PostMapping
    public Property post(@RequestBody Property property) {
        return propertyService.post(property);
    }

    @GetMapping
    public ArrayList<Property> get() { return propertyService.get(); }
}
