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
public abstract class Payment {
    float amount;
    Date paymentDate;
    String description;
    Tenant payer;

    public ArrayList<Payment> list(){
    return null;
    }

    public void pay(){
    }
}
