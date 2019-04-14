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
public class FoodMenu {
    String name;
    String description;
    ArrayList<ArrayList<String>> dailyMenus;
    public ArrayList<FoodMenu> listWeeklyFoodMenu(){
    return null;
    }

    public FoodMenu(String name, String description, ArrayList<ArrayList<String>> dailyMenus) {
        this.name = name;
        this.description = description;
        this.dailyMenus = dailyMenus;
    }
    public void manage(String name, String description, ArrayList<ArrayList<String>> dailyMenus) {
        this.name = name;
        this.description = description;
        this.dailyMenus = dailyMenus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<ArrayList<String>> getDailyMenus() {
        return dailyMenus;
    }

    public void setDailyMenus(ArrayList<ArrayList<String>> dailyMenus) {
        this.dailyMenus = dailyMenus;
    }
    
}
