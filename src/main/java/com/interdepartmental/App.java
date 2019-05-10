package com.interdepartmental;

import com.interdepartmental.model.Booking;
import com.interdepartmental.model.ObserverConfig;
import com.interdepartmental.model.PropertyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class App
{
    //Run the Application
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        System.out.println("---");
        new ObserverConfig();
    }
}
