package com.example.linkedinscraper.jobs.reader;

import com.jobmatcher.model.models.LinkedinJobs;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class LinkedinReader implements ItemReader<LinkedinJobs> {
    @Override
    public LinkedinJobs read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return null;
    }

}
