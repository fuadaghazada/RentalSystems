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

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dormitory extends Property{
    ArrayList<Tenant> roommates;

    public Dormitory(String name, String description, String street, String district, String zipcode, String type, ArrayList<PropertyUnit> propertyUnits, ArrayList<Tenant> roommates){
        super(name, description, street, district, zipcode, type, propertyUnits);
        this.roommates = roommates;
    }


}
