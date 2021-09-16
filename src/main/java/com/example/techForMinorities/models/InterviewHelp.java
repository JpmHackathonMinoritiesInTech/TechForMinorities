package com.example.techForMinorities.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class InterviewHelp {

    @Id
    @GeneratedValue
    private Long id;

    private String resourceName;
    @Lob
    private String description;
    @Lob
    private String url;

    public InterviewHelp(String resourceName, String description, String url) {
        this.resourceName = resourceName;
        this.description = description;
        this.url = url;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }
}
