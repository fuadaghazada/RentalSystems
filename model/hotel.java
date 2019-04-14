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
public class Hotel extends Property{
    boolean hasView;

    public Hotel(boolean hasView, String name, String description, String street, String district, String zipcode, String type) {
        super(name, description, street, district, zipcode, type);
        this.hasView = hasView;
    }

    public boolean isHasView() {
        return hasView;
    }

    public void setHasView(boolean hasView) {
        this.hasView = hasView;
    }
    
}
