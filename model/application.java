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
public abstract class application {
    Date applyDate;
    int requestDuration;
    tenant applicant;
    propertyManager formCreator;
    String agreementRules;
    public void fill(){
    }

    public application(Date applyDate, int requestDuration, tenant applicant, propertyManager formCreator, String agreementRules) {
        this.applyDate = applyDate;
        this.requestDuration = requestDuration;
        this.applicant = applicant;
        this.formCreator = formCreator;
        this.agreementRules = agreementRules;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public int getRequestDuration() {
        return requestDuration;
    }

    public void setRequestDuration(int requestDuration) {
        this.requestDuration = requestDuration;
    }

    public tenant getApplicant() {
        return applicant;
    }

    public void setApplicant(tenant applicant) {
        this.applicant = applicant;
    }

    public propertyManager getFormCreator() {
        return formCreator;
    }

    public void setFormCreator(propertyManager formCreator) {
        this.formCreator = formCreator;
    }

    public String getAgreementRules() {
        return agreementRules;
    }

    public void setAgreementRules(String agreementRules) {
        this.agreementRules = agreementRules;
    }
    
}
