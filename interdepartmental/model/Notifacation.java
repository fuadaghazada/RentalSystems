/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interdepartmental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notifacation {
    PropertyManager from;
    Tenant to;
    Date date;
    String message;

    public void send(PropertyManager from, Tenant to, Date date, String message) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.message = message;
    }
}
