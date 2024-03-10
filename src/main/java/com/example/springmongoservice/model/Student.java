package com.example.springmongoservice.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.core.annotation.AliasFor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("students")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    String id;

    String name;

    int age;

    String course;
}
