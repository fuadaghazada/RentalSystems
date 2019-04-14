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
public class PropertyManager extends User{
    Date startDate;
    Date endDate;
    int yearsOfExperience;

    public PropertyManager(Date startDate, Date endDate, int yearsOfExperience, String name, String email, String password, String tckn, String phone) {
        super(name, email, password, tckn, phone);
        this.startDate = startDate;
        this.endDate = endDate;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
}
