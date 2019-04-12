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
public class tenant {
  Date livingStartDate;
  Date livingEndDate;
  float maxBudget;
  float minBudget;

    public tenant(Date livingStartDate, Date livingEndDate, float maxBudget, float minBudget) {
        this.livingStartDate = livingStartDate;
        this.livingEndDate = livingEndDate;
        this.maxBudget = maxBudget;
        this.minBudget = minBudget;
    }
    public void manage(Date livingStartDate, Date livingEndDate, float maxBudget, float minBudget){
    
    }
    public ArrayList<tenant> list(){
    return null;
    }
    public void enterTime(){
    
    }
    public ArrayList<tenant> listEntranceTimes(){
    return null;
    }
    public void markAway(tenant t){
    
    }
    public Date getLivingStartDate() {
        return livingStartDate;
    }

    public void setLivingStartDate(Date livingStartDate) {
        this.livingStartDate = livingStartDate;
    }

    public Date getLivingEndDate() {
        return livingEndDate;
    }

    public void setLivingEndDate(Date livingEndDate) {
        this.livingEndDate = livingEndDate;
    }

    public float getMaxBudget() {
        return maxBudget;
    }

    public void setMaxBudget(float maxBudget) {
        this.maxBudget = maxBudget;
    }

    public float getMinBudget() {
        return minBudget;
    }

    public void setMinBudget(float minBudget) {
        this.minBudget = minBudget;
    }
  
}
