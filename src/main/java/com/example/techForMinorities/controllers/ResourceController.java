package com.example.techForMinorities.controllers;

import com.example.techForMinorities.repositories.BootcampInfoRepo;
import com.example.techForMinorities.repositories.InterviewHelpRepo;
import com.example.techForMinorities.repositories.MentorsRepo;
import com.example.techForMinorities.repositories.SelfDirectedRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResourceController {

    private BootcampInfoRepo bootcampInfoRepo;
    private InterviewHelpRepo interviewHelpRepo;
    private MentorsRepo mentorsRepo;
    private SelfDirectedRepo selfDirectedRepo;

    public ResourceController(BootcampInfoRepo bootcampInfoRepo, InterviewHelpRepo interviewHelpRepo,
                              MentorsRepo mentorsRepo, SelfDirectedRepo selfDirectedRepo) {
        this.bootcampInfoRepo = bootcampInfoRepo;
        this.interviewHelpRepo = interviewHelpRepo;
        this.mentorsRepo = mentorsRepo;
        this.selfDirectedRepo = selfDirectedRepo;
    }

    @GetMapping("/resources")
    public String displayResourcesPage(Model model) {
        model.addAttribute("bootCampResources", bootcampInfoRepo.findAll());
        model.addAttribute("interviewHelpResources", interviewHelpRepo.findAll());
        model.addAttribute("mentorResources", mentorsRepo.findAll());
        model.addAttribute("selfDirectedResources", selfDirectedRepo.findAll());

        return "resources.html";
    }

    @GetMapping("/")
    public String displayHomePage() {
        return "index.html";
    }

    @GetMapping("/experience-question")
    public String displayExperienceQuestionPage() {
        return "experience-page.html";
    }

    @GetMapping("/video")
    public String displayYoutubeVideoPage() {
        return "youtube-video-page.html";
    }

    @GetMapping("/find-resources")
    public String displayResourceChoices() {
        return "find-resources.html";
    }
}
