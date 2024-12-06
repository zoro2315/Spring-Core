package com.lu2code;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    public String getDailyWorkout()
    {
        return "Practice 40 minutes daily";
    }
}
