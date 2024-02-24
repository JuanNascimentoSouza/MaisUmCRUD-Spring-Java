package com.example.CRUD.domain.model;

import jakarta.persistence.*;
import lombok.*;

//@Table(name = "cursos")
@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length=200, nullable = false)
    private String name;
    @Column(length = 10, nullable = false)
    private String category;
}
