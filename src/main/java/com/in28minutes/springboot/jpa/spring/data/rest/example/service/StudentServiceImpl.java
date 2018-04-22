package com.in28minutes.springboot.jpa.spring.data.rest.example.service;

import com.in28minutes.springboot.jpa.spring.data.rest.example.student.Student;
import com.in28minutes.springboot.jpa.spring.data.rest.example.student.StudentDataRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDataRestRepository studentDataRestRepository;

    @Override
    public Student getStudentById(long id) {
        return studentDataRestRepository.findById(id).get();
    }
}
