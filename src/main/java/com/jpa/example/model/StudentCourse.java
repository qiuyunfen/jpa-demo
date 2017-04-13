package com.jpa.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentcourse")
public class StudentCourse {
    @Id
    private String stuId;
    private String couId;
    private double grade;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getCouId() {
        return couId;
    }

    public void setCouId(String couId) {
        this.couId = couId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public StudentCourse() {}
    public StudentCourse(String stuId, String couId, double grade) {
        this.stuId = stuId;
        this.couId = couId;
        this.grade = grade;
    }
}
