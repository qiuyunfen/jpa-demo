package com.jpa.example.service;

import com.jpa.example.dao.StudentDao;
import com.jpa.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public Student addStudent(Student student) {
        return studentDao.save(student);
    }

    public Student queryStudent(String id) {
        return studentDao.findById(id);
    }
}
