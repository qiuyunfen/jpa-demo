package com.jpa.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
    private String name;
    @Id
    private String id;
    private String classId;
    private double math;
    private double english;
    private double chinese;
    private double program;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getProgram() {
        return program;
    }

    public void setProgram(double program) {
        this.program = program;
    }
    public Student() {}
    public Student(String name, String stuId, String classId, double math, double english, double chinese, double program) {
        this.name = name;
        this.id = stuId;
        this.classId = classId;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
        this.program = program;
    }
}
