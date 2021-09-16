package com.example.techForMinorities.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SelfDirected {

    @Id
    @GeneratedValue
    private Long id;

    private String resourceName;
    @Lob
    private String description;
    @Lob
    private String url;
    private String paidOrFree;

    public SelfDirected(){}

    public SelfDirected(String resourceName, String description, String url, String paidOrFree) {
        this.resourceName = resourceName;
        this.description = description;
        this.url = url;
        this.paidOrFree = paidOrFree;
    }

    public Long getId() {
        return id;
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

    public String getPaidOrFree() {
        return paidOrFree;
    }
}
