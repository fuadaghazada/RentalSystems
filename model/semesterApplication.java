/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ENES VAROL
 */
public class SemesterApplication extends Application{
    PropertyUnit.type roomType;
    int dormNumber;
    int roomNumber;

    public SemesterApplication(Date applyDate, int requestDuration, Tenant applicant, PropertyManager formCreator, String agreementRules) {
        super(applyDate, requestDuration, applicant, formCreator, agreementRules);
    }
}
