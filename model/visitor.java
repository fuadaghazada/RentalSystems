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
public class visitor {
    String name;
    Date visitDate;
    int visitDuration;
    tenant whoseVisitor;

    public visitor(String name, Date visitDate, int visitDuration, tenant whoseVisitor) {
        this.name = name;
        this.visitDate = visitDate;
        this.visitDuration = visitDuration;
        this.whoseVisitor = whoseVisitor;
    }
public void manage(String name, Date visitDate, int visitDuration, tenant whoseVisitor) {
        this.name = name;
        this.visitDate = visitDate;
        this.visitDuration = visitDuration;
        this.whoseVisitor = whoseVisitor;
    }
public ArrayList<visitor> list(){
return null;}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public int getVisitDuration() {
        return visitDuration;
    }

    public void setVisitDuration(int visitDuration) {
        this.visitDuration = visitDuration;
    }

    public tenant getWhoseVisitor() {
        return whoseVisitor;
    }

    public void setWhoseVisitor(tenant whoseVisitor) {
        this.whoseVisitor = whoseVisitor;
    }
    
}
