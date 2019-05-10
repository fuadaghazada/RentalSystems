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
public abstract class Property {
    String name;
    String description;
    String street;
    enum city{
    }
    String district;
    String zipcode;
    String type;

    ArrayList<PropertyUnit> propertyUnits;

    public void bookProperty(){
    }

    public void leaveProperty(){
    }
}
