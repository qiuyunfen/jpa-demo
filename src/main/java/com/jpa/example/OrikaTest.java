package com.jpa.example;

import com.jpa.example.model.Student;
import com.jpa.example.model.StudentClassDestination;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class OrikaTest {
    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    //don't have match names
    //mapperFactory.classMap(Student.class, StudentClassDestination.class);
}
