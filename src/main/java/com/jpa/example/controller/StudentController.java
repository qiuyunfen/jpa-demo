package com.jpa.example.controller;


import com.jpa.example.model.Student;
import com.jpa.example.service.StudentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(method= RequestMethod.POST)
    @ApiOperation(value="添加学生信息", notes="添加成功输出uccess")
    public Student addStudent(Student studentModel){
        return studentService.addStudent(studentModel);
    }

    @RequestMapping(value="{id}",method=RequestMethod.POST)
    @ApiOperation(value="查询学生信息", notes="输出学生信息")
    public Student queryStudent(String id) {
        return studentService.queryStudent(id);
    }
}
