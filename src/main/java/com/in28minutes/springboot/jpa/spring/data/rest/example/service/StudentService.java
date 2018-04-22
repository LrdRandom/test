package com.in28minutes.springboot.jpa.spring.data.rest.example.service;

import com.in28minutes.springboot.jpa.spring.data.rest.example.student.Student;

public interface StudentService {
    public Student getStudentById(long id);
}
