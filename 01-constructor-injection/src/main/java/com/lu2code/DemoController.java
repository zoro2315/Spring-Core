package com.lu2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    //------- Define a private-field for the bean-dependency :
    private CricketCoach cricketCoach;

    private FootballCoach footballCoach;

    @Autowired
    public DemoController(FootballCoach footballCoach)
    {
        this.footballCoach = footballCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return footballCoach.getDailyWorkout();
    }
}
