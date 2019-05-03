/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interdepartmental.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyUnit {
    enum type{
    }
    String number;
    int floor;
    String description;
    float rent;
    boolean isAvailable;

    public void listAccommodations(){
    }

    public boolean checkAvailability(){
    return false;
    }

    public void changeRoom(){
    }
}
