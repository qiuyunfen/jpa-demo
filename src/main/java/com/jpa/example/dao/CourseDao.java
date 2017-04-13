package com.jpa.example.dao;

import com.jpa.example.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course, String>{
    //Course findByCouId(String couId);
    Course findByCouseName(String courseName);
}
