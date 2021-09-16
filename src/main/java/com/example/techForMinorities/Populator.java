package com.example.techForMinorities;

import com.example.techForMinorities.models.SelfDirected;
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

        SelfDirected selfDirectedResource1 = new SelfDirected("Code Academy", "A site with some free" +
                "options to get started, but you'll need to pay for Pro membership to delve into more advanced concepts.",
                "https://www.codeacademy.com", "Free");
        selfDirectedRepo.save(selfDirectedResource1);

    }
}
