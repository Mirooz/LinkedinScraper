package com.example.linkedinscraper.configuration;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
public class BatchConfiguration {


    private final JobLauncher jobLauncher;
    private final ApplicationContext context;

    public BatchConfiguration(JobLauncher jobLauncher, ApplicationContext context) {
        this.jobLauncher = jobLauncher;
        this.context = context;
    }


}
