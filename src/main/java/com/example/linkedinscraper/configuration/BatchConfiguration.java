package com.example.linkedinscraper.configuration;


import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class jobLauncher {


    private final JobLauncher jobLauncher;
    private final ApplicationContext context;
}
