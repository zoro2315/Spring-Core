package com.lu2code.common;

import org.springframework.stereotype.Component;

@Component("tennis")
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return " Practice your backhand volley";
    }
}