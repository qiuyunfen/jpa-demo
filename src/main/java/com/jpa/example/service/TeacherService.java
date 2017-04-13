package com.jpa.example.service;

import com.jpa.example.dao.TeacherDao;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TeacherService {
    @Autowired
    TeacherDao teacherDao;

    public String queryStudentGrade() {
        return "";
    }
}
