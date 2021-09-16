package com.example.techForMinorities.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Mentors {

    @Id
    @GeneratedValue
    private Long id;

    private String imageUrl;
    private String name;
    private String email;
    private String linkedIn;
    private String languages;
    @Lob
    private String pathToField;
    @Lob
    private String bio;

    public Mentors(String imageUrl, String name, String email, String linkedIn, String languages, String pathToField, String bio) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.email = email;
        this.linkedIn = linkedIn;
        this.languages = languages;
        this.pathToField = pathToField;
        this.bio = bio;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public String getLanguages() {
        return languages;
    }

    public String getPathToField() {
        return pathToField;
    }

    public String getBio() {
        return bio;
    }
}
