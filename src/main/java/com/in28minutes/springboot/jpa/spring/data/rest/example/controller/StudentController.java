package com.in28minutes.springboot.jpa.spring.data.rest.example.controller;

import com.in28minutes.springboot.jpa.spring.data.rest.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/hello")
    public String getHello(){
        return studentService.getStudentById(10001l).getName();
    }
}
