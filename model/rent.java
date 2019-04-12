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
public class rent extends payment {
    propertyUnit paymentField;

    public propertyUnit getPaymentField() {
        return paymentField;
    }

    public void setPaymentField(propertyUnit paymentField) {
        this.paymentField = paymentField;
    }

    public rent(propertyUnit paymentField) {
        this.paymentField = paymentField;
    }
    
}
