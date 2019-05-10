package com.interdepartmental.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserAgentController {
    public enum UserAgent{
        ALL,
        TENANT,
        MANAGER
    }
    public static boolean checkUserAgent(UserAgent expectedUserAgent, String currentUserAgent){
        if(expectedUserAgent == UserAgent.ALL || expectedUserAgent.toString().equals(currentUserAgent)){
            return true;
        }else{
            return false;
        }

    }
}
