package com.jpa.example.service;

import com.jpa.example.dao.StudentCourseDao;
import com.jpa.example.model.StudentCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCourseService {
    @Autowired
    StudentCourseDao studentCourseDao;

    public StudentCourse queryByStuIdAndCouId(String stuId, String couId) {
        return studentCourseDao.findByCouIdAndStuId(stuId, couId);
    }

    public StudentCourse addStudentCourse(StudentCourse studentCourse){
        return studentCourseDao.save(studentCourse);
    }
}
