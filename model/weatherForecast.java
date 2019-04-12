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
public class weatherForecast {
    ArrayList<String> forecasts;
    ArrayList<Float> minTemps;
    ArrayList<Float> maxTemps;

    public weatherForecast(ArrayList<String> forecasts, ArrayList<Float> minTemps, ArrayList<Float> maxTemps) {
        this.forecasts = forecasts;
        this.minTemps = minTemps;
        this.maxTemps = maxTemps;
    }

    public ArrayList<String> getForecasts() {
        return forecasts;
    }

    public void setForecasts(ArrayList<String> forecasts) {
        this.forecasts = forecasts;
    }

    public ArrayList<Float> getMinTemps() {
        return minTemps;
    }

    public void setMinTemps(ArrayList<Float> minTemps) {
        this.minTemps = minTemps;
    }

    public ArrayList<Float> getMaxTemps() {
        return maxTemps;
    }

    public void setMaxTemps(ArrayList<Float> maxTemps) {
        this.maxTemps = maxTemps;
    }
    
    public ArrayList<weatherForecast> list(){
    return null;
    }
}
