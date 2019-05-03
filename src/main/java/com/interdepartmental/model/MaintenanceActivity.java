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
public class MaintenanceActivity {
    String name;
    String description;
    String technicianInfo;
    PropertyUnit propertyUnit;
    Date date;
    float cost;

    public void manage(String name, String description, String technicianInfo, PropertyUnit propertyUnit, Date date, float cost) {
        this.name = name;
        this.description = description;
        this.technicianInfo = technicianInfo;
        this.propertyUnit = propertyUnit;
        this.date = date;
        this.cost = cost;
    }
    
    public ArrayList<MaintenanceActivity> listActivities(){
        return  null;
    }
}
