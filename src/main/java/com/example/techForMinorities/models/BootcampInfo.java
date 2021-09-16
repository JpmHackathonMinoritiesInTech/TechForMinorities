package com.example.techForMinorities.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class BootcampInfo {

    @Id
    @GeneratedValue
    private Long id;

    private String resourceName;
    @Lob
    private String description;
    @Lob
    private String url;
}
