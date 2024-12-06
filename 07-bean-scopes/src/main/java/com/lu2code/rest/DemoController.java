package com.lu2code.rest;

import com.lu2code.common.Coach;
import com.lu2code.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    //------- Define a private-field for the bean-dependency :
    private Coach myCoach;

    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach myCoach, @Qualifier("cricketCoach") Coach anotherCoach)
    {
        System.out.println("In Constructor : " + getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;


    }

    /*@Autowired
    public void setCoach(CricketCoach cricketCoach)
    {
        this.cricketCoach = cricketCoach;
    }
*/

    @GetMapping("/check")
    public String checkScope()
    {
        return "Comparing beans : myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }


    @GetMapping("/")
    public String hello()
    {
        return "Hello World!";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
