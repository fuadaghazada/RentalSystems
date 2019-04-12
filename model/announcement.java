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
public class announcement {
    propertyManager from;
    property to;
    String topic;
    String message;

    public announcement(propertyManager from, property to, String topic, String message) {
        this.from = from;
        this.to = to;
        this.topic = topic;
        this.message = message;
    }
    public void manage(propertyManager from, property to, String topic, String message) {
        this.from = from;
        this.to = to;
        this.topic = topic;
        this.message = message;
    }

    public propertyManager getFrom() {
        return from;
    }

    public void setFrom(propertyManager from) {
        this.from = from;
    }

    public property getTo() {
        return to;
    }

    public void setTo(property to) {
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
    
    public ArrayList<announcement> listAnnouncements(){
    return null;
    }
}
