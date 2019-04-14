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
public class Request {
    enum type{
    }
    Tenant requester;
    String note;
    Date date;
    public void request(type t){
    }

    public Request(Tenant requester, String note, Date date) {
        this.requester = requester;
        this.note = note;
        this.date = date;
    }

    public Tenant getRequester() {
        return requester;
    }

    public void setRequester(Tenant requester) {
        this.requester = requester;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
