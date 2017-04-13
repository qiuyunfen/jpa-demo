package com.jpa.example.dao;

import com.jpa.example.model.StudentCourse;
import org.springframework.data.repository.CrudRepository;

public interface TeacherDao extends CrudRepository<StudentCourse, String>{

}
