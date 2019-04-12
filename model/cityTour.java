/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ENES VAROL
 */
public class cityTour {
    Date tourDate;
    float duration;
    ArrayList<tenant> attendants;
    propertyManager organizer;
    String startLocation;
    String endLocation;
    Date startTime;
    Date endTime;
    public ArrayList<cityTour> list(){
    return null;
    }

    public cityTour(Date tourDate, float duration, ArrayList<tenant> attendants, propertyManager organizer, String startLocation, String endLocation, Date startTime, Date endTime) {
        this.tourDate = tourDate;
        this.duration = duration;
        this.attendants = attendants;
        this.organizer = organizer;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void manage(Date tourDate, float duration, ArrayList<tenant> attendants, propertyManager organizer, String startLocation, String endLocation, Date startTime, Date endTime) {
        this.tourDate = tourDate;
        this.duration = duration;
        this.attendants = attendants;
        this.organizer = organizer;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setTourDate(Date tourDate) {
        this.tourDate = tourDate;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setAttendants(ArrayList<tenant> attendants) {
        this.attendants = attendants;
    }

    public void setOrganizer(propertyManager organizer) {
        this.organizer = organizer;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
}
