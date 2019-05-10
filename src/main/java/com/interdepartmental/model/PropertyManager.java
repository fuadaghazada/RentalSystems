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
public class PropertyManager extends User implements Observer{
    Date startDate;
    Date endDate;
    int yearsOfExperience;

    public PropertyManager(Date startDate, Date endDate, int yearsOfExperience, String name, String email, String password, String tckn, String phone) {
        super(name, email, password, tckn, phone);
        this.startDate = startDate;
        this.endDate = endDate;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void update() {

    }
}
