package com.jpa.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
    @Id
    private String couId;
    private String couseName;

    public String getCouId() {
        return couId;
    }

    public void setCouId(String couId) {
        this.couId = couId;
    }

    public String getCouseName() {
        return couseName;
    }

    public void setCouseName(String couseName) {
        this.couseName = couseName;
    }
    public Course() {}
    public Course(String couId, String couseName) {
        this.couId = couId;
        this.couseName = couseName;
    }
}
