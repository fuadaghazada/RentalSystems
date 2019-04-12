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
public class parkingSpot {
    tenant owner;
    int spotNum;
    public ArrayList<parkingSpot> listParkingSpots(){
    return null;
    }

    public parkingSpot(tenant owner, int spotNum) {
        this.owner = owner;
        this.spotNum = spotNum;
    }

    public tenant getOwner() {
        return owner;
    }

    public void setOwner(tenant owner) {
        this.owner = owner;
    }

    public int getSpotNum() {
        return spotNum;
    }

    public void setSpotNum(int spotNum) {
        this.spotNum = spotNum;
    }
    
}
