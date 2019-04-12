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
public class facility {
    String name;
    String description;
    property propery;
    int openingHour;
    int closingHour;
    int capacity;
    int currentlyAllocated;
    public void listFacilities(){
    }
    public void bookFacility(facility f){
    }

    public facility(String name, String description, property propery, int openingHour, int closingHour, int capacity, int currentlyAllocated) {
        this.name = name;
        this.description = description;
        this.propery = propery;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
        this.capacity = capacity;
        this.currentlyAllocated = currentlyAllocated;
    }
    public void manageFacility(String name, String description, property propery, int openingHour, int closingHour, int capacity, int currentlyAllocated) {
        this.name = name;
        this.description = description;
        this.propery = propery;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
        this.capacity = capacity;
        this.currentlyAllocated = currentlyAllocated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public property getPropery() {
        return propery;
    }

    public void setPropery(property propery) {
        this.propery = propery;
    }

    public int getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(int openingHour) {
        this.openingHour = openingHour;
    }

    public int getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(int closingHour) {
        this.closingHour = closingHour;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentlyAllocated() {
        return currentlyAllocated;
    }

    public void setCurrentlyAllocated(int currentlyAllocated) {
        this.currentlyAllocated = currentlyAllocated;
    }
    
}
