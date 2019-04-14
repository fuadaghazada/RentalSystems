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
public class Faq {
    ArrayList<String> questions;
    ArrayList<String> answers;
    Tenant questioner;
    PropertyManager answerer;
    String questionTopic;
    Date askDate;
    Date answerDate;

    public Faq(ArrayList<String> questions, ArrayList<String> answers, Tenant questioner, PropertyManager answerer, String questionTopic, Date askDate, Date answerDate) {
        this.questions = questions;
        this.answers = answers;
        this.questioner = questioner;
        this.answerer = answerer;
        this.questionTopic = questionTopic;
        this.askDate = askDate;
        this.answerDate = answerDate;
    }
    public void manage(ArrayList<String> questions, ArrayList<String> answers, Tenant questioner, PropertyManager answerer, String questionTopic, Date askDate, Date answerDate) {
        this.questions = questions;
        this.answers = answers;
        this.questioner = questioner;
        this.answerer = answerer;
        this.questionTopic = questionTopic;
        this.askDate = askDate;
        this.answerDate = answerDate;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public Tenant getQuestioner() {
        return questioner;
    }

    public void setQuestioner(Tenant questioner) {
        this.questioner = questioner;
    }

    public PropertyManager getAnswerer() {
        return answerer;
    }

    public void setAnswerer(PropertyManager answerer) {
        this.answerer = answerer;
    }

    public String getQuestionTopic() {
        return questionTopic;
    }

    public void setQuestionTopic(String questionTopic) {
        this.questionTopic = questionTopic;
    }

    public Date getAskDate() {
        return askDate;
    }

    public void setAskDate(Date askDate) {
        this.askDate = askDate;
    }

    public Date getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }
    
    public ArrayList<Faq> listFaq(){
    return null;}
}
