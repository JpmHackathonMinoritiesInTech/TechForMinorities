package com.example.techForMinorities;

import com.example.techForMinorities.models.BootcampInfo;
import com.example.techForMinorities.models.InterviewHelp;
import com.example.techForMinorities.models.SelfDirected;
import com.example.techForMinorities.models.Mentors;
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
                     MentorsRepo mentorsRepo, SelfDirectedRepo selfDirectedRepo) {
        this.bootcampInfoRepo = bootcampInfoRepo;
        this.interviewHelpRepo = interviewHelpRepo;
        this.mentorsRepo = mentorsRepo;
        this.selfDirectedRepo = selfDirectedRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        SelfDirected selfDirectedResource1 = new SelfDirected("Code Academy", "A site with some free" +
                "options to get started, but you'll need to pay for Pro membership to delve into more advanced concepts.",
                "https://www.codeacademy.com", "Free");
        selfDirectedRepo.save(selfDirectedResource1);

        SelfDirected selfDirectedResource2 = new SelfDirected("Khan Academy", "A great resource for learning programming concepts with an incredible suite of math courses if your programming goals require it.", "https://www.khanacademy.org/", "Free");
        selfDirectedRepo.save(selfDirectedResource2);

        SelfDirected selfDirectedResource3 = new SelfDirected("University of Helsinki MOOC Java", "A Massive Open Online Course (MOOC) offered by the University of Helsinki. It offers in-depth Java coursework, including foundational skills that will be transferrable to other languages.", "https://java-programming.mooc.fi/", "Free");
        selfDirectedRepo.save(selfDirectedResource3);

        SelfDirected selfDirectedResource4 = new SelfDirected("MIT Open Courseware", "A free collection of historical coursework from MIT. Subjects include but are not limited to Computer Science.", "https://ocw.mit.edu/courses/find-by-topic/#cat=engineering&subcat=computerscience", "Free");
        selfDirectedRepo.save(selfDirectedResource4);

        SelfDirected selfDirectedResource5 = new SelfDirected("Youtube", "There are a huge number of tutorial videos that can help you along no matter what stage you are at in your learning journey.", "youtube.com", "Free");
        selfDirectedRepo.save(selfDirectedResource5);

        SelfDirected selfDirectedResource6 = new SelfDirected("The Odin Project", "A free, open source introduction to fundamental coding concepts and deeper project-based coursework.", "https://www.theodinproject.com", "Free");
        selfDirectedRepo.save(selfDirectedResource6);

        SelfDirected selfDirectedResource7 = new SelfDirected("Your local library", "Always check your local library. There’s a good chance they will have a great selection of written and electronic resources to learn about any number of topics.", "https://www.worldcat.org/libraries", "Free");
        selfDirectedRepo.save(selfDirectedResource7);

        SelfDirected selfDirectedResource8 = new SelfDirected("FreeCodeCamp", "This site offers bite-sized (and bigger) courses about a myriad of programming topics, from beginner to expert.", "https://www.freecodecamp.org/", "Free");
        selfDirectedRepo.save(selfDirectedResource8);

        SelfDirected selfDirectedResource9 = new SelfDirected("Udemy", "A trove of online learning courses about programming and more. Courses often go on sale for deep discounts, so make sure to keep an eye on anything you’re interested in.", "https://www.udemy.com/", "Paid");
        selfDirectedRepo.save(selfDirectedResource9);

        SelfDirected selfDirectedResource10 = new SelfDirected("App Acadmey", "A comprehensive course designed to prepare you to enter the field of software development on a full- or part-time basis to kickstart your career.", "https://www.appacademy.io/", "Paid");
        selfDirectedRepo.save(selfDirectedResource10);

        SelfDirected selfDirectedResource11 = new SelfDirected("Udacity", "An online education portal aimed at developing in-demand skills to get your foot in the door of a new career.", "https://www.udacity.com/", "Paid");
        selfDirectedRepo.save(selfDirectedResource11);

        SelfDirected selfDirectedResource12 = new SelfDirected("LinkedIn Learning", "LinkedIn is for more than just networking! If you enroll for their premium membership, you’ll have access to a wide array of coursework, as well, to brush up on your skills.", "https://www.linkedin.com/", "Paid");
        selfDirectedRepo.save(selfDirectedResource12);

        Mentors mentor1 = new Mentors("https://www.istockphoto.com/photo/ive-got-everything-i-need-to-have-a-productive-workday-gm588253980-100992091", "Naomi Negash", "naomi.negash@email.com", "linkedin.com/naominegash", "language", "Boothcamp", "Hi there! I'm Naomi. I moved to the states when I was 26. Unfortunately, my computer science degree was not recognized. I did not want to spend another 4 years in school. A bootcamp was my best option. My journey has given me a passion to help immigrant manouver the tech realm.");
        mentorsRepo.save(mentor1);

        Mentors mentor2 = new Mentors("https://www.istockphoto.com/photo/the-man-with-the-plan-gm800305700-129833331?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_top&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fmen-in-tech&utm_term=men%20in%20tech%3A%3Asearch-aggressive-affiliates-v1%3Aa", "Timothy Jones", "timothy.jones@email.com", "linkedin.com/timothyjones", "language", "Boothcamp", "Hi there. My name is Timothy Jones. I started off in finance with a degree from The Ohio State University. After collaborating on a project that required me to understand some of the coding logic I realized I wanted to know more. Enroll in a bootcamp helped me emensly with my career switch. Don't be afraid to make a change. I'm so happy I did!");
        mentorsRepo.save(mentor2);

        Mentors mentor3 = new Mentors("https://www.istockphoto.com/photo/female-it-developer-at-workplace-gm1255905237-367553319?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_top&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fwomen-in-tech&utm_term=women%20in%20tech%3A%3Asearch-aggressive-affiliates-v1%3Aa", "Julia Webb", "julia.webb@email.com", "linkedin.com/juliawebb", "language", "Boothcamp", "Hello! My name is Julia. At the age of 36 I decided to take a chance on myself and enrolled in a computer coding bootcamp. With no prior college education, who would have thought that I'd be a full stack developer?! If I can do it, trust me, so can you!");
        mentorsRepo.save(mentor3);

        Mentors mentor4 = new Mentors("https://www.istockphoto.com/photo/hes-always-ready-to-help-gm1163753970-319658364?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_top&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fmen-in-tech&utm_term=men%20in%20tech%3A%3Asearch-aggressive-affiliates-v1%3Aa", "Mark Sanchez", "mark.sanchez@email.com", "linkedin.com/marksanchez", "language", "Self-taught", "Hello, I'm Mark. I'm living proof anyone can be successful in tech. It's not easy, but possible. With today's resources, it is even more possible. Speaking of resources, you've got one right here!");
        mentorsRepo.save(mentor4);

        InterviewHelp interviewHelpHrResource1 = new InterviewHelp("You Tube", "STAR Interview Method Explained",
                "https://www.youtube.com/watch?v=dWK26jZgsM8 ");
        interviewHelpRepo.save(interviewHelpHrResource1);

        InterviewHelp interviewHelpHrResource2 = new InterviewHelp("The Balanced Careers", "What is the STAR interview",
                "https://www.thebalancecareers.com/what-is-the-star-interview-response-technique-2061629");
        interviewHelpRepo.save(interviewHelpHrResource2);

        InterviewHelp interviewHelpHrResource3 = new InterviewHelp("Indeed", "How to use the STAR interview response technique",
                "https://www.indeed.com/career-advice/interviewing/how-to-use-the-star-interview-response-technique");
        interviewHelpRepo.save(interviewHelpHrResource2);

        InterviewHelp interviewHelpTechResource1 = new InterviewHelp("Learn to code with me", "Technical Interview Explained",
                "https://learntocodewith.me/posts/technical-interview/#technical-interview");
        interviewHelpRepo.save(interviewHelpTechResource1);

        InterviewHelp interviewHelpTechResource2 = new InterviewHelp("Code Academy", "Technical Interview Guide",
                "https://www.codecademy.com/resources/blog/technical-interview-guide/");
        interviewHelpRepo.save(interviewHelpTechResource2);

        InterviewHelp interviewHelpTechResource3 = new InterviewHelp("freeCodeCamp", "The 30-minute guide to rocking your next coding interview",
                "https://www.freecodecamp.org/news/coding-interviews-for-dummies-5e048933b82b/");
        interviewHelpRepo.save(interviewHelpTechResource3);

        InterviewHelp interviewHelpTechQuestions1 = new InterviewHelp("Indeed", "29 Software Engineer Interview Questions (With Example Answers)",
                "https://www.indeed.com/career-advice/interviewing/software-engineer-interview-questions");
        interviewHelpRepo.save(interviewHelpTechQuestions1);

        InterviewHelp interviewHelpTechQuestions2 = new InterviewHelp("Spring Board", "31 Software Engineering Interview Questions With Answers",
                "https://www.springboard.com/blog/software-engineering/21-software-engineering-interview-questions/");
        interviewHelpRepo.save(interviewHelpTechQuestions2);

        InterviewHelp interviewHelpTechQuestions3 = new InterviewHelp("Guru 99", "Top 50 Software Engineering Interview Questions and Answers",
                "https://www.guru99.com/software-engineering-interview-questions.html");
        interviewHelpRepo.save(interviewHelpTechQuestions3);

        InterviewHelp interviewHelpCodingInterview1 = new InterviewHelp("freeCodeCamp", "Free Coding Interview Prep Courses",
                "https://www.freecodecamp.org/learn/coding-interview-prep/#algorithms");
        interviewHelpRepo.save(interviewHelpCodingInterview1);

        InterviewHelp interviewHelpCodingInterview2 = new InterviewHelp("You Tube", "How to pass a coding interview | Coding interview preparation|Interview tips for software developer",
                "https://www.youtube.com/watch?v=K_oJLQx2ySY");
        interviewHelpRepo.save(interviewHelpCodingInterview2);

        InterviewHelp interviewHelpCodingInterview3 = new InterviewHelp("You Tube", "Mock Coding Interview | Coding interview prep for beginners",
                "https://www.youtube.com/watch?v=or6zCRq3tFo");
        interviewHelpRepo.save(interviewHelpCodingInterview3);

        InterviewHelp interviewHelpCodingInterview4 = new InterviewHelp("Educative", "Paid: Coding interview course and tutorial",
                "https://www.educative.io/courses/grokking-the-coding-interview?aff=x06V");
        interviewHelpRepo.save(interviewHelpCodingInterview4);

        InterviewHelp interviewHelpCodingInterview5 = new InterviewHelp("AlgoExpert", "Paid: Ultimate Resource to prepare for coding interviews",
                "https://www.algoexpert.io/product");
        interviewHelpRepo.save(interviewHelpCodingInterview5);

        InterviewHelp interviewHelpCodingInterview6 = new InterviewHelp("Coderbyte", "Paid: Coding challenges and courses to help ace coding interviews",
                "https://coderbyte.com/#courses");
        interviewHelpRepo.save(interviewHelpCodingInterview6);

        InterviewHelp interviewHelpMockInterview1 = new InterviewHelp("Scaler Academy", "Free and Anonymous Mock Interviews",
                "https://www.interviewbit.com/mock-interview/ ");
        interviewHelpRepo.save(interviewHelpMockInterview1);

        InterviewHelp interviewHelpMockInterview2 = new InterviewHelp("Pramp", "Paid: Professional Coaching and Mock Interviews",
                "https://www.interviewbit.com/mock-interview/ ");
        interviewHelpRepo.save(interviewHelpMockInterview2);

        BootcampInfo bootcampInfo1 = new BootcampInfo("2021 Best Coding Bootcamps you can join",
                "Learn more what makes a bootcamp successful.",
                "https://www.switchup.org/rankings/best-coding-bootcamps"
                );
        BootcampInfo bootcampInfo = new BootcampInfo("Are Coding Bootcamps worth it?",
                "Learn more if coding bootcamp is best option for you",
                "https://www.bestcolleges.com/bootcamps/guides/are-coding-bootcamps-worth-it/");

        BootcampInfo bootcampInfo3 = new BootcampInfo("Why many people choose bootcamp?",
                "Learn coding-controll your future",
                "https://www.techelevator.com/?gclid=Cj0KCQjw1ouKBhC5ARIsAHXNMI-WwG4SNH4QLvtEOtaUI7Opr_JxIbRpAp4BAHF523-u682pTEN3WXkaAoLpEALw_wcB");
    }
}
