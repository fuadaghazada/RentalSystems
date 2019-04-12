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
public class notifacation {
    propertyManager from;
    tenant to;
    Date date;
    String message;

    public notifacation(propertyManager from, tenant to, Date date, String message) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.message = message;
    }
    public void send(propertyManager from, tenant to, Date date, String message) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.message = message;
    }

    public propertyManager getFrom() {
        return from;
    }

    public void setFrom(propertyManager from) {
        this.from = from;
    }

    public tenant getTo() {
        return to;
    }

    public void setTo(tenant to) {
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
