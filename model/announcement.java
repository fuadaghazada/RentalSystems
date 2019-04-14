/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ENES VAROL
 */
public class Announcement {
    PropertyManager from;
    Property to;
    String topic;
    String message;

    public Announcement(PropertyManager from, Property to, String topic, String message) {
        this.from = from;
        this.to = to;
        this.topic = topic;
        this.message = message;
    }
    public void manage(PropertyManager from, Property to, String topic, String message) {
        this.from = from;
        this.to = to;
        this.topic = topic;
        this.message = message;
    }

    public PropertyManager getFrom() {
        return from;
    }

    public void setFrom(PropertyManager from) {
        this.from = from;
    }

    public Property getTo() {
        return to;
    }

    public void setTo(Property to) {
        this.to = to;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public ArrayList<Announcement> listAnnouncements(){
    return null;
    }
}
