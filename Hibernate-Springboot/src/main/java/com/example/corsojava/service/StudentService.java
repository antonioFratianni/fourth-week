package com.example.corsojava.service;

import com.example.corsojava.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Optional<Student> findById(String id);

    List<Student> findAll();

    void deleteById(String id);

    Optional<Student> findByIdAndName(String id, String name);

}
