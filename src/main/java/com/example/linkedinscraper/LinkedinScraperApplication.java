package com.example.linkedinscraper;

import com.example.linkedinscraper.configuration.BatchConfiguration;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.jobmatcher.model.repositories")
@EntityScan("com.jobmatcher.model.models")
public class LinkedinScraperApplication {


	public static void main(String[] args) {
		SpringApplication.run(LinkedinScraperApplication.class, args);

	}

}
