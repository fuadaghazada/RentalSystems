/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interdepartmental.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facility {
    String name;
    String description;
    Property propery;
    int openingHour;
    int closingHour;
    int capacity;
    int currentlyAllocated;

    public void listFacilities(){
    }

    public void bookFacility(Facility f){
    }

    public void manageFacility(String name, String description, Property propery, int openingHour, int closingHour, int capacity, int currentlyAllocated) {
        this.name = name;
        this.description = description;
        this.propery = propery;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
        this.capacity = capacity;
        this.currentlyAllocated = currentlyAllocated;
    }
}
