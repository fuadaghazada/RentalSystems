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
public class FoodMenu {
    String name;
    String description;
    ArrayList<ArrayList<String>> dailyMenus;
    public ArrayList<FoodMenu> listWeeklyFoodMenu(){
    return null;
    }

    public void manage(String name, String description, ArrayList<ArrayList<String>> dailyMenus) {
        this.name = name;
        this.description = description;
        this.dailyMenus = dailyMenus;
    }
}
