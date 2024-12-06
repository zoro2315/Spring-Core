package com.lu2code.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach{

    public CricketCoach()
    {
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling for 15 minutes.";
    }
}
