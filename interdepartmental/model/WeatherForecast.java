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

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherForecast {
    ArrayList<String> forecasts;
    ArrayList<Float> minTemps;
    ArrayList<Float> maxTemps;
    
    public ArrayList<WeatherForecast> list(){
    return null;
    }
}
