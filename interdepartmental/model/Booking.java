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
public class Booking {
    Tenant tenant;
    PropertyUnit property;
    Date bookingDate;
    Date bookingStarts;
    Date bookingEnds;

    public ArrayList<Booking> list(){
        return null;
    }
}
