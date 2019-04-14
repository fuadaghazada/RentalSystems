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
public abstract class Application {
    Date applyDate;
    int requestDuration;
    Tenant applicant;
    PropertyManager formCreator;
    String agreementRules;
    public void fill(){
    }

    public Application(Date applyDate, int requestDuration, Tenant applicant, PropertyManager formCreator, String agreementRules) {
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

    public Tenant getApplicant() {
        return applicant;
    }

    public void setApplicant(Tenant applicant) {
        this.applicant = applicant;
    }

    public PropertyManager getFormCreator() {
        return formCreator;
    }

    public void setFormCreator(PropertyManager formCreator) {
        this.formCreator = formCreator;
    }

    public String getAgreementRules() {
        return agreementRules;
    }

    public void setAgreementRules(String agreementRules) {
        this.agreementRules = agreementRules;
    }
    
}
