/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interdepartmental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityTour {
    Date tourDate;
    float duration;
    ArrayList<Tenant> attendants;
    PropertyManager organizer;
    String startLocation;
    String endLocation;
    Date startTime;
    Date endTime;

    public ArrayList<CityTour> list(){
    return null;
    }

    public void manage(Date tourDate, float duration, ArrayList<Tenant> attendants, PropertyManager organizer, String startLocation, String endLocation, Date startTime, Date endTime) {
        this.tourDate = tourDate;
        this.duration = duration;
        this.attendants = attendants;
        this.organizer = organizer;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
