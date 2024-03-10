package com.example.springmongoservice;

import com.example.springmongoservice.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepo extends MongoRepository<Student, String> {
}
