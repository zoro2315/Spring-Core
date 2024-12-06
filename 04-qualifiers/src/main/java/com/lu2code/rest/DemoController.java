package com.lu2code.rest;

import com.lu2code.common.Coach;
import com.lu2code.common.CricketCoach;
import com.lu2code.config.JavaConfig;
import com.lu2code.config.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    //------- Define a private-field for the bean-dependency :
    private Coach myCoach;

    private Student student;

    @Autowired
    public DemoController(/*@Qualifier("tennis")*/ Coach myCoach ,/*@Qualifier("shoeab")*/ Student student)
    {
        this.myCoach = myCoach;
        this.student = student;
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


    @GetMapping("/studentDetails")
    public String getStudentDetails()
    {
        return student.toString();
    }



}
