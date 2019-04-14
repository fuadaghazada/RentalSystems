/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ENES VAROL
 */
public class Dormitory extends Property{
    ArrayList<Tenant> roommates;

    public Dormitory(ArrayList<Tenant> roommates, String name, String description, String street, String district, String zipcode, String type) {
        super(name, description, street, district, zipcode, type);
        this.roommates = roommates;
    }

    public ArrayList<Tenant> getRoommates() {
        return roommates;
    }

    public void setRoommates(ArrayList<Tenant> roommates) {
        this.roommates = roommates;
    }
    
}
