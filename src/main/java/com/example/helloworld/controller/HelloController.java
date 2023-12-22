package com.example.helloworld.controller;




import com.example.helloworld.entity.Student;
import com.example.helloworld.repo.StudentRepository;
import com.example.helloworld.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World, Spring Boot!";
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student added: " + student.getId();
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}


