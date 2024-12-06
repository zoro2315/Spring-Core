package com.lu2code.rest;

import com.lu2code.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    //------- Define a private-field for the bean-dependency :
    private CricketCoach cricketCoach;

    @Autowired
    public DemoController(CricketCoach cricketCoach)
    {
        this.cricketCoach = cricketCoach;
    }

    @GetMapping("/")
    public String hello()
    {
        return "Hello World!";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return cricketCoach.getDailyWorkout();
    }
}
