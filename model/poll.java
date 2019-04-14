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
public class Poll {
    String pollTopic;
    ArrayList<String> questions;
    ArrayList<String> choices;
    ArrayList<ArrayList<String>> stats;
    Date pollDate;
    ArrayList<Tenant> participants;
    PropertyManager pollOpener;

    public Poll(String pollTopic, ArrayList<String> questions, ArrayList<String> choices, ArrayList<ArrayList<String>> stats, Date pollDate, ArrayList<Tenant> participants, PropertyManager pollOpener) {
        this.pollTopic = pollTopic;
        this.questions = questions;
        this.choices = choices;
        this.stats = stats;
        this.pollDate = pollDate;
        this.participants = participants;
        this.pollOpener = pollOpener;
    }

    public String getPollTopic() {
        return pollTopic;
    }

    public void setPollTopic(String pollTopic) {
        this.pollTopic = pollTopic;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public ArrayList<ArrayList<String>> getStats() {
        return stats;
    }

    public void setStats(ArrayList<ArrayList<String>> stats) {
        this.stats = stats;
    }

    public Date getPollDate() {
        return pollDate;
    }

    public void setPollDate(Date pollDate) {
        this.pollDate = pollDate;
    }

    public ArrayList<Tenant> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Tenant> participants) {
        this.participants = participants;
    }

    public PropertyManager getPollOpener() {
        return pollOpener;
    }

    public void setPollOpener(PropertyManager pollOpener) {
        this.pollOpener = pollOpener;
    }
    
    public void attendPoll(){
    }
    
}
