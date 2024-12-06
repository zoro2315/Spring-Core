package com.lu2code.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach()
    {
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }


    // ---------- Bean-LifeCycle methods...

    //---- @PostConstruct : init-related code
    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("In doMyStartupStuff() : " + getClass().getSimpleName());
    }

    //----- @PreDestroy : cleanUp-related code :
    @PreDestroy
    public void doCleanUpStuff()
    {
        System.out.println("In doCleanUpStuff() : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling for 15 minutes.";
    }
}
