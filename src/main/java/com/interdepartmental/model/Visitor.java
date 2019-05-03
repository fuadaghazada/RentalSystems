/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interdepartmental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor {
    String name;
    Date visitDate;
    int visitDuration;
    Tenant whoseVisitor;

    public void manage(String name, Date visitDate, int visitDuration, Tenant whoseVisitor) {
        this.name = name;
        this.visitDate = visitDate;
        this.visitDuration = visitDuration;
        this.whoseVisitor = whoseVisitor;
    }

    public ArrayList<Visitor> list(){
        return null;
    }
}
