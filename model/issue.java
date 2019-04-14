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
public class Issue {
    Date issueOpenDate;
    Date issueCloseDate;
    String issueTopic;
    Tenant issueOpener;
    PropertyManager issueCloser;

    public Issue(Date issueOpenDate, Date issueCloseDate, String issueTopic, Tenant issueOpener, PropertyManager issueCloser) {
        this.issueOpenDate = issueOpenDate;
        this.issueCloseDate = issueCloseDate;
        this.issueTopic = issueTopic;
        this.issueOpener = issueOpener;
        this.issueCloser = issueCloser;
    }

    public Date getIssueOpenDate() {
        return issueOpenDate;
    }

    public void setIssueOpenDate(Date issueOpenDate) {
        this.issueOpenDate = issueOpenDate;
    }

    public Date getIssueCloseDate() {
        return issueCloseDate;
    }

    public void setIssueCloseDate(Date issueCloseDate) {
        this.issueCloseDate = issueCloseDate;
    }

    public String getIssueTopic() {
        return issueTopic;
    }

    public void setIssueTopic(String issueTopic) {
        this.issueTopic = issueTopic;
    }

    public Tenant getIssueOpener() {
        return issueOpener;
    }

    public void setIssueOpener(Tenant issueOpener) {
        this.issueOpener = issueOpener;
    }

    public PropertyManager getIssueCloser() {
        return issueCloser;
    }

    public void setIssueCloser(PropertyManager issueCloser) {
        this.issueCloser = issueCloser;
    }
    
    public ArrayList<Issue> list(){
    return null;
    }
    
    public void answer(){
    }
    public void markIssueAsClosed(){
    }
    
}
