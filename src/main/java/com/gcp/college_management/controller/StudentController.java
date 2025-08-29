package com.gcp.college_management.controller;

import com.gcp.college_management.entity.Student;
import com.gcp.college_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student add(@RequestBody Student s) {
        return studentService.addStudent(s);
    }
}