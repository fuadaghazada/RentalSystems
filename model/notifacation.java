/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ENES VAROL
 */
public class Notifacation {
    PropertyManager from;
    Tenant to;
    Date date;
    String message;

    public Notifacation(PropertyManager from, Tenant to, Date date, String message) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.message = message;
    }
    public void send(PropertyManager from, Tenant to, Date date, String message) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.message = message;
    }

    public PropertyManager getFrom() {
        return from;
    }

    public void setFrom(PropertyManager from) {
        this.from = from;
    }

    public Tenant getTo() {
        return to;
    }

    public void setTo(Tenant to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
