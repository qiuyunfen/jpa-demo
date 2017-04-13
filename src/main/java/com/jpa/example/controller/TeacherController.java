package com.jpa.example.controller;

import com.jpa.example.dao.CourseDao;
import com.jpa.example.model.Course;
import com.jpa.example.model.Student;
import com.jpa.example.model.StudentCourse;
import com.jpa.example.service.CourseService;
import com.jpa.example.service.StudentCourseService;
import com.jpa.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RestController
@Path("student")
public class TeacherController {

    @Autowired
    CourseService courseService;
    @Autowired
    StudentCourseService studentCourseService;
    @Autowired
    StudentService studentService;

    @GET
    @Path("/{studentId}/course/{courseId}")
    public String queryStudentGrade(@PathParam("studentId")String studentId,
                                    @PathParam("courseId")String courseId,
                                    @HeaderParam("teacherClass")String teacherClass,
                                    @HeaderParam("teacherCourse")String teacherCourse) {

        studentService.addStudent(new Student("tom", "1", "1"));
        courseService.addCourse(new Course("1", "math"));
        studentCourseService.addStudentCourse(new StudentCourse("1", "1", 99));
        Course course = courseService.queryCourseById(teacherCourse);
        if(studentId.equals(teacherClass) && course!= null && course.getCouId().equals(courseId)) {
            StudentCourse studentCourse = studentCourseService.queryByStuIdAndCouId(studentId, courseId);
            double grade = studentCourse.getGrade();
            return String.valueOf(grade);
        } else {
            return "not allowed";
        }
    };
}
