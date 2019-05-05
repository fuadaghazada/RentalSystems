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
public class Faq {
    ArrayList<String> questions;
    ArrayList<String> answers;
    Tenant questioner;
    PropertyManager answerer;
    String questionTopic;
    Date askDate;
    Date answerDate;

    public ArrayList<Faq> listFaq(){
        return null;
    }
}
