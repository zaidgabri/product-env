package com.example.helloworld.repo;

import com.example.helloworld.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can add custom query methods here if needed
}
