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
public class ParkingSpot {
    Tenant owner;
    int spotNum;
    public ArrayList<ParkingSpot> listParkingSpots(){
    return null;
    }

    public ParkingSpot(Tenant owner, int spotNum) {
        this.owner = owner;
        this.spotNum = spotNum;
    }

    public Tenant getOwner() {
        return owner;
    }

    public void setOwner(Tenant owner) {
        this.owner = owner;
    }

    public int getSpotNum() {
        return spotNum;
    }

    public void setSpotNum(int spotNum) {
        this.spotNum = spotNum;
    }
    
}
