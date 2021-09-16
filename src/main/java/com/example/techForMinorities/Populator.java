package com.example.techForMinorities;

import com.example.techForMinorities.repositories.BootcampInfoRepo;
import com.example.techForMinorities.repositories.InterviewHelpRepo;
import com.example.techForMinorities.repositories.MentorsRepo;
import com.example.techForMinorities.repositories.SelfDirectedRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private BootcampInfoRepo bootcampInfoRepo;
    private InterviewHelpRepo interviewHelpRepo;
    private MentorsRepo mentorsRepo;
    private SelfDirectedRepo selfDirectedRepo;

    public Populator(BootcampInfoRepo bootcampInfoRepo, InterviewHelpRepo interviewHelpRepo,
                              MentorsRepo mentorsRepo, SelfDirectedRepo selfDirectedRepo){
        this.bootcampInfoRepo = bootcampInfoRepo;
        this.interviewHelpRepo = interviewHelpRepo;
        this.mentorsRepo = mentorsRepo;
        this.selfDirectedRepo = selfDirectedRepo;
    }

    @Override
    public void run(String... args) throws Exception{


    }
}
