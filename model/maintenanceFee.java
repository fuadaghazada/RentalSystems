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
public class maintenanceFee extends payment{
    propertyUnit paymentField;
    public void payFee(){
    }

    public propertyUnit getPaymentField() {
        return paymentField;
    }

    public void setPaymentField(propertyUnit paymentField) {
        this.paymentField = paymentField;
    }

    public maintenanceFee(propertyUnit paymentField) {
        this.paymentField = paymentField;
    }
    
}
