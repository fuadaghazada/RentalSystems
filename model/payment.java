/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ENES VAROL
 */
public abstract class payment {
    float amount;
    Date paymentDate;
    String description;
    tenant payer;
    public ArrayList<payment> list(){
    return null;
    }
    public void pay(){
    }
}
