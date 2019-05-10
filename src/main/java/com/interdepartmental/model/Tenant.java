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
public class Tenant extends User {
    Date livingStartDate;
    Date livingEndDate;
    float maxBudget;
    float minBudget;

    public Tenant(Date livingStartDate, Date livingEndDate, float maxBudget, float minBudget, String name, String email, String password, String tckn, String phone) {
        super(name, email, password, tckn, phone);
        this.livingStartDate = livingStartDate;
        this.livingEndDate = livingEndDate;
        this.maxBudget = maxBudget;
        this.minBudget = minBudget;
    }

    public ArrayList<Tenant> list(){
    return null;
    }

    public void enterTime(){

    }

    public ArrayList<Tenant> listEntranceTimes(){
    return null;
    }

    public void markAway(Tenant t){

    }
}
