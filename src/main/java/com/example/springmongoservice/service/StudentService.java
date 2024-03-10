package com.example.springmongoservice.service;

import com.example.springmongoservice.StudentRepo;
import com.example.springmongoservice.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    public Student addStudent(Student student) {
        return studentRepo.insert(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
