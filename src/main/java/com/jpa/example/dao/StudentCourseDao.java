package com.jpa.example.dao;


import com.jpa.example.model.StudentCourse;
import org.springframework.data.repository.CrudRepository;

public interface StudentCourseDao extends CrudRepository<StudentCourse, String>{
    StudentCourse findByCouIdAndStuId(String stuId, String couId);
}
