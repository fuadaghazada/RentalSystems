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
public abstract class Property {
    String name;
    String description;
    String street;
    enum city{
    }
    String district;
    String zipcode;
    String type;
    public Property() {
    }
    public void bookProperty(){
    }
    public void leaveProperty(){
    }

    public Property(String name, String description, String street, String district, String zipcode, String type) {
        this.name = name;
        this.description = description;
        this.street = street;
        this.district = district;
        this.zipcode = zipcode;
        this.type = type;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
