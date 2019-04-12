/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ENES VAROL
 */
public class maintenanceActivity {
    String name;
    String description;
    String technicianInfo;
    propertyUnit propertyUnit;
    Date date;
    float cost;

    public maintenanceActivity(String name, String description, String technicianInfo, propertyUnit propertyUnit, Date date, float cost) {
        this.name = name;
        this.description = description;
        this.technicianInfo = technicianInfo;
        this.propertyUnit = propertyUnit;
        this.date = date;
        this.cost = cost;
    }
    public void manage(String name, String description, String technicianInfo, propertyUnit propertyUnit, Date date, float cost) {
        this.name = name;
        this.description = description;
        this.technicianInfo = technicianInfo;
        this.propertyUnit = propertyUnit;
        this.date = date;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnicianInfo() {
        return technicianInfo;
    }

    public void setTechnicianInfo(String technicianInfo) {
        this.technicianInfo = technicianInfo;
    }

    public propertyUnit getPropertyUnit() {
        return propertyUnit;
    }

    public void setPropertyUnit(propertyUnit propertyUnit) {
        this.propertyUnit = propertyUnit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public ArrayList<maintenanceActivity> listActivities(){
    return  null;}
}
