package com.interdepartmental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class FeatureFlagController {
    @Autowired
    private Environment env;
    public boolean checkFeatureFlag(String feature){
        if(env.getProperty(feature).equals("true")){
            return true;
        }else{
            return false;
        }

    }
}
