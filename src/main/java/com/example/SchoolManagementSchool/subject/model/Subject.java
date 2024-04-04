package com.example.SchoolManagementSchool.subject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.HashSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(name = "subject_teacher",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )

    private Set<Teacher> teachers = new HashSet<>();

    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students = new HashSet<>();

    // Constructors, getters, and setters

}


