package com.jpa.example.model;

import javax.persistence.Entity;

@Entity
public class StudentClassDestination {
    private double classSum;
    private String stuName;

    public double getClassSum() {
        return classSum;
    }

    public void setClassSum(double classSum) {
        this.classSum = classSum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public StudentClassDestination() {}
    public StudentClassDestination(String stuName, double classSum) {
        this.stuName = stuName;
        this.classSum = classSum;
    }
}
