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
public class semesterApplication extends application{
    propertyUnit.type roomType;
    int dormNumber;
    int roomNumber;

    public semesterApplication(Date applyDate, int requestDuration, tenant applicant, propertyManager formCreator, String agreementRules) {
        super(applyDate, requestDuration, applicant, formCreator, agreementRules);
    }
}
