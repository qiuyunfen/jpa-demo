package com.jpa.example.service;

import com.jpa.example.dao.CourseDao;
import com.jpa.example.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public Course queryCourseById(String couName) {
        return courseDao.findByCouseName(couName);
    }
    public Course addCourse(Course course) {
        return courseDao.save(course);
    }
}
