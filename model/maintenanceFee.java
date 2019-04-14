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
public class MaintenanceFee extends Payment{
    PropertyUnit paymentField;
    public void payFee(){
    }

    public PropertyUnit getPaymentField() {
        return paymentField;
    }

    public void setPaymentField(PropertyUnit paymentField) {
        this.paymentField = paymentField;
    }

    public MaintenanceFee(PropertyUnit paymentField) {
        this.paymentField = paymentField;
    }
    
}
