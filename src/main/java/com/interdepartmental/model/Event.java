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
public class Event {
    String name;
    String description;
    PropertyManager organizer;
    Date dateCreated;
    Date eventDate;

    public ArrayList<Event> listEvents(){
    return null;
    }

    public void manage(String name, String description, PropertyManager organizer, Date dateCreated, Date eventDate) {
        this.name = name;
        this.description = description;
        this.organizer = organizer;
        this.dateCreated = dateCreated;
        this.eventDate = eventDate;
    }
}
