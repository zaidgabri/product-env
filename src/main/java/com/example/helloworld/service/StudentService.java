package com.example.helloworld.service;


import com.example.helloworld.entity.Student;
import com.example.helloworld.repo.StudentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @PostConstruct
    public void init() {
        // Add some sample data when the application starts
        addStudent(new Student("John", "Doe", 22, "john.doe@example.com"));
        addStudent(new Student("Jane", "Smith", 21, "jane.smith@example.com"));
        addStudent(new Student("Bob", "Johnson", 23, "bob.johnson@example.com"));
    }


}

