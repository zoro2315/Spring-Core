package com.lu2code.config;

import com.lu2code.common.Coach;
import com.lu2code.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig
{
    @Bean("aquatic")
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
