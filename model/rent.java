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
public class Rent extends Payment {
    PropertyUnit paymentField;

    public PropertyUnit getPaymentField() {
        return paymentField;
    }

    public void setPaymentField(PropertyUnit paymentField) {
        this.paymentField = paymentField;
    }

    public Rent(PropertyUnit paymentField) {
        this.paymentField = paymentField;
    }
    
}
