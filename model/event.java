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
public class Event {
    String name;
    String description;
    PropertyManager organizer;
    Date dateCreated;
    Date eventDate;
    public ArrayList<Event> listEvents(){
    return null;
    }

    public Event(String name, String description, PropertyManager organizer, Date dateCreated, Date eventDate) {
        this.name = name;
        this.description = description;
        this.organizer = organizer;
        this.dateCreated = dateCreated;
        this.eventDate = eventDate;
    }
    public void manage(String name, String description, PropertyManager organizer, Date dateCreated, Date eventDate) {
        this.name = name;
        this.description = description;
        this.organizer = organizer;
        this.dateCreated = dateCreated;
        this.eventDate = eventDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PropertyManager getOrganizer() {
        return organizer;
    }

    public void setOrganizer(PropertyManager organizer) {
        this.organizer = organizer;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
    
}
