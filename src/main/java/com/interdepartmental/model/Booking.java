/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interdepartmental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking implements Subject {
    Tenant tenant;
    PropertyUnit property;
    Date bookingDate;
    Date bookingStarts;
    Date bookingEnds;

    public ArrayList<Observer> observers = new ArrayList<>();

    @Override
    @Bean
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers)
        {
            observer.update();
        }
    }
}
