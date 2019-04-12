/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ENES VAROL
 */
public class rule {
    int number;
    String topic;
    String description;
    public ArrayList<rule> listRules(){
    return null;
    }
    public void postRules(){
    }
    public void manageRules(){
    }

    public rule(int number, String topic, String description) {
        this.number = number;
        this.topic = topic;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
