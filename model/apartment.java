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
public class apartment extends property{
    String electricityNo;
    String waterNo;

    public apartment(String electricityNo, String waterNo, String name, String description, String street, String district, String zipcode, String type) {
        super(name, description, street, district, zipcode, type);
        this.electricityNo = electricityNo;
        this.waterNo = waterNo;
    }

    public String getElectricityNo() {
        return electricityNo;
    }

    public void setElectricityNo(String electricityNo) {
        this.electricityNo = electricityNo;
    }

    public String getWaterNo() {
        return waterNo;
    }

    public void setWaterNo(String waterNo) {
        this.waterNo = waterNo;
    }
    
}
