package com.lu2code.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig
{
    @Bean
    public Student ahsan()
    {
        Student ahsan = new Student(7027,"Ahsan","Chicago");

        return ahsan;
    }

    @Bean
    public Student shoeab()
    {
        Student shoeab = new Student(7018,"Shoeab","Hyderabad");

        return shoeab;
    }

    @Bean
    @Primary
    public Student zaki()
    {
        Student zaki = new Student(7035,"Zaki","Melbourne");

        return zaki;
    }
}
