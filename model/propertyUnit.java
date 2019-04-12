/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ENES VAROL
 */
public class propertyUnit {
    enum type{
    }
    String number;
    int floor;
    String description;
    float rent;
    boolean isAvailable;

    public propertyUnit(String number, int floor, String description, float rent, boolean isAvailable) {
        this.number = number;
        this.floor = floor;
        this.description = description;
        this.rent = rent;
        this.isAvailable = isAvailable;
    }
    public void listAcoommodations(){
    }
    public boolean checkAvailability(){
    return false;
    }
    public void changeRoom(){
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRent() {
        return rent;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
}
