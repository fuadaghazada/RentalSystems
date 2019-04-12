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
public class summerApplication extends application{
    propertyUnit.type roomType;
    int dormNumber;
    int roomNumber;
    Date startDate;
    Date endDate;

    public summerApplication(Date applyDate, int requestDuration, tenant applicant, propertyManager formCreator, String agreementRules) {
        super(applyDate, requestDuration, applicant, formCreator, agreementRules);
    }
}
